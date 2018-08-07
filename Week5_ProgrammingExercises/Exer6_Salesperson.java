public class Exer6_Salesperson {

    private int id;
    private double sales;
    Exer6_Salesperson(int idNum, double amt)
    {
        id = idNum;
        sales = amt;
    }
    int getId()
    {
        return id;
    }
    double getSales()
    {
        return sales;
    }
    public void setId(int idNum)
    {
        id = idNum;
    }
    private void setSales(double amt)
    {
        sales = amt;
    }
}
