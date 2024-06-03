package MAy2024.ex25052024;

    public class Bank
    {
        private String currency;
        private Integer amount;
        public Bank(String currency, Integer amount)
        {
            this.currency = currency;
            this.amount = amount;
        }

        public String getCurrency()
        {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public Integer add (Bank bankname) throws Exception
    {
        if(!bankname.currency.equalsIgnoreCase("INR")){
            throw new Exception("Currency doesnot match");
        }
        Integer sum = this.amount + bankname.amount;
        return sum;
    }
        public Integer add1 (Bank bankname)
        {try{
            if(!bankname.currency.equalsIgnoreCase("INR")){
                throw new Exception("Currency doesnot match");
            }}
            catch(Exception e){
                throw new RuntimeException(e);
            }
            Integer sum = this.amount + bankname.amount;
            return sum;
        }}



