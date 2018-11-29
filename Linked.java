public class Linked
{
    Chaine chaine;

    Linked() 
    {

    }

    Linked(Chaine chaine)
    {
        this.chaine = chaine;
    }

    void AddChaineFirst(Chaine newchaine)
    {
        this.chaine = newchaine;
        newchaine = new Chaine(this.First, this.chaine);
    }

    void AddLastChaine(Chaine newchaine)
    {
        if (this.Last == null)
            newchaine = new Chaine(this.Last, this.chaine)
        else
        {
            this.chaine = this.chaine.getLastChaine();
            chaine.setLastChaine(new Chaine(this.Last, this.chaine));
        }
    }

    void removeChainePosition(int position)
    {
        for (int i = 0; i < position; i++)
        {
            this.chaine = this.chaine.getNextChaine();
        }
        this.chaine = this.chaine.removeNextPostion();
    }

}