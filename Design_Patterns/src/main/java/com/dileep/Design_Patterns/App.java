package com.dileep.Design_Patterns;
import TemplatePattern.*;
import SingletonPattern.*;
import AdapterPattern.*;
import CommandPattern.*;
import PrototypePattern.*;
import BridgePattern.*;

public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
		DriverTemplate t = new DriverTemplate();
		DriverSingleton s = new DriverSingleton();
		DriverAdapter a = new DriverAdapter();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		DriverPrototype p = new DriverPrototype();
    }
}
