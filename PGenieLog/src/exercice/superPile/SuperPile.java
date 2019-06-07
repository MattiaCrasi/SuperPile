
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

	public void empiler(int valeur)
		{
		push(valeur);
		}

	public int depiler()
		{
		if (0 == taille())
			{
			notifyElement();
			return 0;
			}
		else
			{
			return pop();
			}
		}

	public int sommet()
		{
		int premier = pop();
		push(premier);

		return premier;
		}

	public int sousSommet()
		{
		int premier = pop();
		int second = pop();
		push(second);
		push(premier);

		return second;
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
