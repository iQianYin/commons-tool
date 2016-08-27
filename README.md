# commons-tool

包含的工具有：
1. 支持对properties文件的读取，使用演示：
	PropHelper.addProp("test", "test.properties");
	PropConfig testProp = PropHelper.getProp("test");
	int intVar = testProp.getInteger("intVar");
	String strVar = testProp.getValue("strVar");
	boolean boolVar = testProp.getBoolean("boolVar");