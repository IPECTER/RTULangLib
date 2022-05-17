# RTULangLib 1.0.0
[ Minecraft Plugin ] 1.16 ~ 1.18 Language Mojang-Translation Library, Get Localized Mob/Item Name!

**RTULangManager.getManager()**

- String **getEntityName(Entity, Player)**
- String **getEntityName(Entity, String locale)**
- String **getEntityName(EntityType, Player)**
- String **getEntityName(EntityType, String locale)**

  return Entity's localized Name
  

- String **getEntityDisplayName(Entity, Player)**
- String **getEntityDisplayName(Entity, String locale)**
  
  return Entity's localized Name
  *if Entity has Custom Name, return custom name


- String **getItemName(ItemStack, Player)**
- String **getItemName(ItemStack, String locale)**
- String **getItemName(Material, Player)**
- String **getItemName(Material, String locale)**

  return Item's localized Name


- String **getItemDisplayName(ItemStack, Player)**
- String **getItemDisplayName(ItemStack, String locale)**

  return Item's localized Name
  *if Item has Display Name, return display name

# Gradle&Maven
maven repo soon maybe...!




Fork & Base
https://github.com/MascusJeoraly/LanguageUtils
