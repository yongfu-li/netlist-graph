package net.xprova.netlist;

import java.util.HashMap;
import java.util.Map;

public class Netlist {

	public String name;
	
	public String port_list;

	public HashMap<String, Port> ports;

	public HashMap<String, Net> nets;

	public HashMap<String, Module> modules;

	public void print() {

		print("Module name: " + name);

		print("");

		print("Ports: ");

		for (Map.Entry<String, Port> entry : ports.entrySet()) {

			entry.getValue().print();

		}

		print("");

		print("Nets: ");

		for (Map.Entry<String, Net> entry : nets.entrySet()) {

			entry.getValue().print();

		}

	}

	private void print(String s) {

		System.out.println(s);

	}

}
