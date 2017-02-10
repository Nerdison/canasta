// cards.java

package cards;

// TODO: Implement Comparable Interface
public class Card
{
   /********************* STATIC VARIABLES ************************/

   private static boolean sUsesJokers = true;
   
   /********************* MEMBER VARIABLES ************************/

   private int mRank;
   private int mSuit;

   /********************* CONSTRUCTORS ****************************/
   
   /***************************************************************
    * DEFAULT CONSTRUCTOR
    * Initialize a blank (unuseable) card
    ***************************************************************/
   public Card()
   {
      setRank(0);
      setSuit(0);
   }
   
   /***************************************************************
    * COPY CONSTRUCTOR
    * Copy a card
    * PARAMETERS:
    *   old     Old card to copy
    ***************************************************************/
   public Card(Card old)
   {
      setRank(old.getRank());
      setSuit(old.getSuit());
   }

   /***************************************************************
    * CONSTRUCTOR WITH ID
    * Create a new card based on id (i.e. position in deck)
    * Values 1 -> 52 (no jokers)
    * Values 1 -> 24 (w/ jokers)
    * PARAMETERS:
    *   id      Id of card to create (1 = "Ad" -> 52 = "Ks")
    ***************************************************************/
   public Card(int id)
   {
      setId(id);
   }

   /***************************************************************
    * CONSTRUCTOR WITH RANK AND SUIT
    * Create a new card with given rank and suit
    * Ranks:
    *   1 -> 10 Idem
    *   11      Jack
    *   12      Queen
    *   13      King
    *   14      Joker 1 (if Jokers are used)
    *   15      Joker 2 (is Jokers are used)
    * Suits:
    *   1       Diamonds
    *   2       Clubs
    *   3       Hearts
    *   4       Spades
    *   5       Jokers (if used)
    * PARAMETERS:
    *   rank    Rank of card (1 -> 15)
    *   suit    Suit of card (1 -> 5)
    ***************************************************************/
   public Card(int rank, int suit)
   {
      mRank = rank;
      mSuit = suit;
   }

   /************************** ACCESSORS **************************/

   /***************************************************************
    * GET RANK
    ***************************************************************/
   public int getRank()
   {
      return mRank;
   }

   /***************************************************************
    * GET SUIT
    ***************************************************************/
   public int getSuit()
   {
      return mSuit;
   }

   /***************************************************************
    * GET ID
    ***************************************************************/
   public int getId()
   {
      return -1;
   }

   public static boolean getUsesJokers()
   {
      return sUsesJokers;
   }
   
   /************************** MUTATORS ***************************/
   
   /***************************************************************
    * SET RANK
    ***************************************************************/
   public void setRank(int rank)
   {
      if (rank >= 1 && rank <= 52)
         mRank = rank;
      else if (sUsesJokers && (rank == 53 || rank == 54))
         mRank = rank;
      else
         mRank = 0;
   }
   
   /***************************************************************
    * SET SUIT
    ***************************************************************/
   public void setSuit(int suit)
   {
      if (suit >= 1 && suit <= 52)
         mSuit = suit;
      else if (sUsesJokers && suit == 5)
         mSuit = suit;
      else
         mSuit = 0;
   }
   
   /***************************************************************
    * SET ID
    ***************************************************************/
   public void setId(int id)
   {
      
   }

   /***************************************************************
    * SET USES JOKERS
    ***************************************************************/
   public static void setUsesJokers(boolean usesJokers)
   {
      sUsesJokers = usesJokers;
   }

   // TODO: Define compareTo() methods
   // TOOD: Define equals() method
   // TODO: Define toString() method
}
