public class Square{
	String currentColor;
	String correctColor;
	int gridX;
	int gridY;
	
	public Square(string inputCorrectColor, int inputGridX, int inputGridY)
	{
		correctColor = inputCorrectColor;
		currentColor = "g";
		gridX = inputGridX;
		gridY = inputGridY;
	}

	public static void changeCurrentColor(String inputColor)
	{
		currentColor = inputColor;
	}

	public static bool isCurrentColorCorrect(){
		if (currentCollor.equals(correctColor))
		{
			return true
		}
		else
		{
			return false
		}
	}
}
