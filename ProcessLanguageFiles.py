import os
import shutil

path = os.getenv("APPDATA").replace("\\", "/") + "/.minecraft/assets/"
version_filename = input("Version: ") + ".json"
sounds = ""
try:
    version_file = open(path + "indexes/" + version_filename, 'r', encoding='UTF-8')
    os.makedirs("out", exist_ok=True)
except FileNotFoundError as err:
    print(err)
try:
    os.makedirs("out/original/langs", exist_ok=True)
    os.makedirs("out/processed/langs", exist_ok=True)
except OSError as err:
    print(err)

for content in version_file:
    lines = content.replace("}, \"", "},\n").split("\n")
for line in lines:
    if line.__contains__("minecraft/lang/"):
        file = line.replace("\"", "").replace(":", "").replace("{", "").split(" hash ")[0]
        file_name = file.split("lang/")[1]
        file_hash = (line.replace("\"", "").replace(":", "")
            .replace("{", "").split("hash ")[1]).split(" size")[0].replace(",", "")
        try:
            print("objects/" + file_hash[:2] + "/" + file_hash)
            shutil.copyfile(path + "objects/" + file_hash[:2] + "/" + file_hash, "out/original/langs/" + file_name)
            print("파일 복사 " + file_name)
        except OSError as err:
            print(err)

print("단순화 작업 중...")

version_file.close()
keep = 'item.minecraft.', 'entity.minecraft.', 'block.minecraft.'
try:
    os.makedirs("optimizedLangs", exist_ok=True)
except OSError as err:
    print(err)
lang_list = open("out/langList.txt", 'w', encoding='UTF-8')
for lang_filename in os.listdir('out/original/langs'):
    lang_list.write("#" + lang_filename.replace(".json", "") + "\n")
    lang_file = open("out/original/langs/" + lang_filename, 'r', encoding='UTF-8')
    processed_lang_file = open("out/processed/langs/" + lang_filename.replace(".json", ".lang"), 'w', encoding='UTF-8')
    lines = lang_file.read().replace("    \"", "").replace("{\n", "").replace("\"\n}", "").replace("\": \"",
                                                                                                   "=").replace("\",",
                                                                                                                "").split(
        "\n")
    for line in lines:
        if line.startswith(keep):
            processed_lang_file.write(line + "\n")
    print("단순화 " + lang_filename)
    lang_file.close()
    processed_lang_file.close()
lang_list.close()
print("완료하였습니다")
