package test;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

import dimensions.impl.Dimensions;

public class TestClass
{
	public static void main(String[] args)
	{
		JsonFactory factory = new JsonFactory();
		JsonGenerator jg = null;
		try
		{
			Writer w = new StringWriter();
			jg = factory.createGenerator(w);
			jg.useDefaultPrettyPrinter();
			write(jg, new Dimensions(6.50, 10.10, 62.35));
			
			System.out.println(w);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
	}

	private static void write(JsonGenerator jg, Dimensions dimension) throws IOException
	{
		jg.writeStartObject();
		jg.writeNumberField("length", dimension.getLength());
		jg.writeNumberField("width", dimension.getWidth());
		jg.writeNumberField("depth", dimension.getDepth());
		jg.writeEndObject();
		jg.close();
	}
}
