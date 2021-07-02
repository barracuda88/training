package Test;

import com.company.GlobalConstants;
import com.company.Model;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestModel {
    private final double EPS = 1e-9;
    private static Model model;

    @BeforeClass
    public static void run(){
        model=new Model();
        model.setBound(GlobalConstants.PRIMARY_MIN_BARRIER,GlobalConstants.PRIMARY_MAX_BARRIER);
        model.setRandomNumber();
    }
    @Test
    public void getBottomBoundShouldGetZero(){
        Assert.assertEquals(0,model.getBottomBound(),EPS);
    }
    @Test
    public void getUperBoundShouldGetOneHundread(){
        Assert.assertEquals(100,model.getUperBound(),EPS);
    }
    @Test
    public void numberComparisonShouldGetFalse(){
        int number=model.getRandomNumber()+1;
        Assert.assertNotEquals(false,model.numberComparison(model.getRandomNumber()+1));

    }
    @Test
    public void numberComparisonShouldGetTrue(){
        Assert.assertNotEquals(true,model.numberComparison(model.getRandomNumber()));
    }
    @Test
    public void addTryShouldGetOne(){
        model.addTry(1);
        if(!(model.getAllTry().get(0).equals(1))){
            Assert.fail();
        }
    }
  // @Ignore
    @Test
    public void setRandomNumberShouldGetNinetyNine(){
        boolean checkNinetyNine=false;
        int number;
        for(int i=1;i<1000000000;++i){
            model.setRandomNumber();
            number= model.getRandomNumber();
            if(number==99){

                checkNinetyNine=true;
            }
        }
        Assert.assertEquals(true,checkNinetyNine);
    }
   @Ignore
    @Test
    public void setRandomNumberShouldGetZero(){
        boolean checkZero=false;
        int nunber;
        for(int i=1;i<1000000000;++i){
            model.setRandomNumber();
            nunber= model.getRandomNumber();
            if(nunber==1){

                checkZero=true;
            }
        }
        Assert.assertEquals(true,checkZero);
    }
    @Ignore
    @Test
    public void checkOutofTheBorder(){
        boolean checkBorder=false;
        int number;
        for (int i=1;i<1000000;++i){
            model.setRandomNumber();
            number=model.getRandomNumber();
            if(number <= 0 | number >= 100){
                checkBorder=true;
            }
        }
        Assert.assertNotEquals(true,checkBorder);
    }
}
