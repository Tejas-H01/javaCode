    package OOP_codes.Abstraction;

    public   class NetBankingPayment extends Payment {
        private double balance = 10000;

        @Override
        public boolean makePayment(double amount) {
            if (balance - amount >= 1000) {
                balance -= amount;
                System.out.println("Net Banking payment successful.");
                return true;
            } else {
                System.out.println("Insufficient balance.");
                return false;
            }
        }
    }
