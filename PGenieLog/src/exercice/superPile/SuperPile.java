
package exercice.superPile;

import java.util.Stack;

/**
 * singleton
 */
public class SuperPile extends Stack<Integer>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private SuperPile()
		{

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public void empiler(int x)
		{
		push(x);
		}

	public int depiler()
		{
		if (0 == taille())
			{
			notifyElement();
			}
		return pop();
		}

	public int taille()
		{
		return size();
		}

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	public static synchronized SuperPile getInstance()
		{
		if (instance == null)
			{
			System.out.println("Existe");
			instance = new SuperPile();
			}

		return instance;
		}

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void notifyElement()
		{
		System.out.println("La pile est vide");
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Tools

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static SuperPile instance = null;
	}
