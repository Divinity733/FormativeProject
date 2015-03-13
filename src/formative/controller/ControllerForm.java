package formative.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ControllerForm
{
	public ControllerForm()
	{
		
	}
	
	public String showForm()
	{
		String result = "";
		
		JOptionPane.showMessageDialog(null, "Hello!");
		result = JOptionPane.showInputDialog(null, "What would you like?");
		
		if(result.equalsIgnoreCase("m1"))
		{
			JOptionPane.showMessageDialog(null,  "MATHEMATICS STATUS:\n" + "Freshman");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		else if(result.equalsIgnoreCase("c1"))
		{
			JOptionPane.showMessageDialog(null,  "COMPUTER SCIENCE STATUS:\n" + "Freshman");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		else if(result.equalsIgnoreCase("i1"))
		{
			JOptionPane.showMessageDialog(null, "INFORMATION TECHNOLOGY STATUS:\n" + "Freshman");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		
		// Sophmores
		else if(result.equalsIgnoreCase("m2"))
		{
			JOptionPane.showMessageDialog(null,  "MATHEMATICS STATUS:\n" + "Sophmores");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		else if(result.equalsIgnoreCase("c2"))
		{
			JOptionPane.showMessageDialog(null,  "COMPUTER SCIENCE STATUS:\n" + "Sophmores");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		else if(result.equalsIgnoreCase("i2"))
		{
			JOptionPane.showMessageDialog(null, "INFORMATION TECHNOLOGY STATUS:\n" + "Sophmores");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		
		// Juniors
		else if(result.equalsIgnoreCase("m3"))
		{
			JOptionPane.showMessageDialog(null,  "MATHEMATICS STATUS:\n" + "Juniors");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		else if(result.equalsIgnoreCase("c3"))
		{
			JOptionPane.showMessageDialog(null,  "COMPUTER SCIENCE STATUS:\n" + "Juniors");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		else if(result.equalsIgnoreCase("i3"))
		{
			JOptionPane.showMessageDialog(null, "INFORMATION TECHNOLOGY STATUS:\n" + "Juniors");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		
		// Seniors
		else if(result.equalsIgnoreCase("m4"))
		{
			JOptionPane.showMessageDialog(null,  "MATHEMATICS STATUS:\n" + "Seniors");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		else if(result.equalsIgnoreCase("c4"))
		{
			JOptionPane.showMessageDialog(null,  "COMPUTER SCIENCE STATUS:\n" + "Seniors");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		else if(result.equalsIgnoreCase("i4"))
		{
			JOptionPane.showMessageDialog(null, "INFORMATION TECHNOLOGY STATUS:\n" + "Seniors");
			result = JOptionPane.showInputDialog(null, "What else would you like?");
		}
		
		
		return result;
	}
	
	public void showRequest(String currentInput)
	{
		JOptionPane.showMessageDialog(null, currentInput);
	}
	
	public void start()
	{
		showForm();
		String input = "";
		
		if (input != null && input.equalsIgnoreCase(".exit"))
		{
			System.exit(0);
		}
	}
}
