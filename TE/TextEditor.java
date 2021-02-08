package TE;

public class TextEditor 
{
	private SpellChecker spellchecker;
	public TextEditor(SpellChecker sc) 
	{
		this.spellchecker=sc;
	}
	public void spellchecker() 
	{
		spellchecker.display();
	}
}
