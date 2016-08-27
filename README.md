# commons-tool

# Tool 01 - 支持对properties文件的读取，示例：
```Java
PropHelper.addProp("test", "test.properties");
PropConfig testProp = PropHelper.getProp("test");
String strVar = testProp.getValue("strVar");
int intVar = testProp.getInteger("intVar");
boolean boolVar = testProp.getBoolean("boolVar");
```
