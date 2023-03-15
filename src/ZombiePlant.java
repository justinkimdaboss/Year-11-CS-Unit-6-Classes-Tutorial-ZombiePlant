public class ZombiePlant
{
    private int potency;
    private int treatments;

    public ZombiePlant(int potency, int treatments)
    {
        this.potency = potency;
        this.treatments = treatments;
    }

    public int getPotency() {
        return potency;
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }

    public int treatmentsNeeded()
    {
        return this.treatments;
    }

    public boolean isDangerous()
    {
        if(treatments > 0)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public void treat(int x)
    {
        if (this.potency >= x)
        {
            treatments = treatments -1;
            if(treatments == 0)
            {
                treatments = 0;
            }
        }
        else if (this.potency <= 0)
        {
            this.treatments = treatments;
        }
        else
        {
        treatments = treatments +1;
        }

    }

}
