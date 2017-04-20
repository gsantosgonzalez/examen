import javax.swing.JOptionPane;

public class Pangramas
{

	public static char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z'};

	public static boolean isPangrama(String text)
	{
		int contador = 0;
		String texto = ignoraTildes(text);
		int textLength = texto.length();
		for (int i = 0; i < alfabeto.length; i++)
		{
			for (int j = 0; j < textLength; j++)
			{
				if(alfabeto[i] == Character.toLowerCase(texto.charAt(j)))
				{
					contador++;
					break;
				}
			}
		}
		System.out.println(contador);
                return contador == alfabeto.length;
	}

	public static String ignoraTildes(String texto)
	{
		char[] letrasAcentuadas = {'á', 'é', 'í', 'ó', 'ú', 'ü'};
		char[] letrasOriginales = {'a', 'e', 'i', 'o', 'u', 'u'};
		for (int i = 0; i < letrasAcentuadas.length; i++)
		{
			texto = texto.replace(letrasAcentuadas[i], letrasOriginales[i]);
		}
		return texto;
	}

	public static void main(String args[])
	{
		String texto = JOptionPane.showInputDialog(null, "Ingrese el Texto a evaluar");
		if(isPangrama(texto))
			//System.out.println("El texto: " + texto + " es un pangrama.");
			JOptionPane.showMessageDialog(null, "El texto " + texto + " es un pangrama.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
		else
			//System.out.println("El texto: " + texto + " no es un pangrama.");
			JOptionPane.showMessageDialog(null, "El texto " + texto + " no es un pangrama.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}