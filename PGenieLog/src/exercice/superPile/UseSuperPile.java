
package exercice.superPile;

public class UseSuperPile
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		int valeur = 11;

		empiler(valeur);
		afficherTaille();
		depilerEtAfficher();
		SommetEtAfficher();
		SousSommetEtAfficher();
		viderPile(valeur);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void empiler(int n)
		{
		for(int i = 0; i < n; i++)
			{
			SuperPile.getInstance().empiler(i);
			}
		}

	private static void afficherTaille()
		{
		System.out.println("La taille de la taille est : " + SuperPile.getInstance().taille());
		}

	private static void depilerEtAfficher()
		{
		System.out.println("Element du sommet et retiré : " + SuperPile.getInstance().depiler());
		}

	private static void SommetEtAfficher()
		{
		System.out.println("Element du sommet non retiré : " + SuperPile.getInstance().sommet());
		}

	private static void SousSommetEtAfficher()
		{
		System.out.println("Element en dessous du sommet : " + SuperPile.getInstance().sousSommet());
		}

	private static void viderPile(int n)
		{
		for(int i = 0; i < n; i++)
			{
			SuperPile.getInstance().depiler();
			}
		}
	}
