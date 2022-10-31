# [ RTULangLib 1.3.1]
[ Minecraft Plugin ] 1.16.X ~ 1.19.X Language Mojang-Translation Library, Get Localized Mob/Item Name!

**RTULangManager.getManager()**

- String **getEntityName(Entity, EnumLang)**
- String **getEntityName(Entity, Player)**
- String **getEntityName(Entity, String locale)**
- String **getEntityName(EntityType, EnumLang)**
- String **getEntityName(EntityType, Player)**
- String **getEntityName(EntityType, String locale)**

  return Entity's localized Name
  
- String **getEntityDisplayName(Entity, EnumLang)**
- String **getEntityDisplayName(Entity, Player)**
- String **getEntityDisplayName(Entity, String locale)**
  
  return Entity's localized Name
  *if Entity has Custom Name, return custom name

- String **getItemName(ItemStack, EnumLang)**
- String **getItemName(ItemStack, Player)**
- String **getItemName(ItemStack, String locale)**
- String **getItemName(Material, EnumLang)**
- String **getItemName(Material, Player)**
- String **getItemName(Material, String locale)**

  return Item's localized Name

- String **getItemDisplayName(ItemStack, EnumLang)**
- String **getItemDisplayName(ItemStack, Player)**
- String **getItemDisplayName(ItemStack, String locale)**

  return Item's localized Name
  *if Item has Display Name, return display name

## Gradle&Maven
maven repo soon maybe...!

## Development Status
https://github.com/IPECTER/RTULangLib/projects/1

## Fork & Base
https://github.com/MascusJeoraly/LanguageUtils
