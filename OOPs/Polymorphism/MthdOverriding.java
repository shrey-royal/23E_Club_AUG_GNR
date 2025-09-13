class RBI {
    protected float interestRate = 7;
    
    float getInterestRate() {
        return interestRate;
    }
}

class SBI extends RBI {

    SBI() {
        super.interestRate += 1.5f;
    }
    
    @Override
    float getInterestRate() {
        return super.interestRate;
    }
}

class ICICI extends RBI {

    ICICI() {
        super.interestRate += 2;
    }
    
    @Override
    float getInterestRate() {
        return super.interestRate;
    }
}

class AXIS extends RBI {

    AXIS() {
        super.interestRate += 2.5f;
    }
    
    @Override
    float getInterestRate() {
        return super.interestRate;
    }
}

public class MthdOverriding {
    public static void main(String[] args) {
        RBI bank;

        bank = new SBI();
        System.out.println("SBI bank interest rate: " + bank.getInterestRate());
        
        bank = new ICICI();
        System.out.println("ICICI bank interest rate: " + bank.getInterestRate());
        
        bank = new AXIS();
        System.out.println("AXIS bank interest rate: " + bank.getInterestRate());
    }
}
// Overriding: It is the ability to modify the existing method of the parent class in the child class.