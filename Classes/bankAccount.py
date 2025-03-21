class BankAccount():
    def __init__(self, balance):
        self.balance = balance

    def deposit(self, amount):
        self.balance = self.balance + amount

    def withdraw(self, amountt):
        self.balance = self.balance - amountt

    def getBalance(self):
        print(self.balance)

myAccount = BankAccount(123456)
myAccount.getBalance()
myAccount.deposit(544)
myAccount.getBalance()
myAccount.withdraw(1000)
myAccount.getBalance()