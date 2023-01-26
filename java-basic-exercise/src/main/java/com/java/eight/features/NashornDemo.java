package com.java.eight.features;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornDemo {
	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine engine = scriptEngineManager.getEngineByName("nashorn");
		try {
			engine.eval(new FileReader(
					"C:\\Users\\Keerthana\\Documents\\Invicta\\JavaBasic\\java-basic-exercise\\src\\main\\java\\com\\java\\eight\\features\\js\\demo.js"));
			Invocable invocable = (Invocable) engine;
			Object result = invocable.invokeFunction("fun1", "Keerthi");
			System.out.println(result);
		} catch (ScriptException | NoSuchMethodException e) {
			e.printStackTrace();
		}
//		engine.eval("print('Hello Keerthi')");
	}
}
