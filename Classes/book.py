class Book:
    def __init__(self, title, author, pages):
        self.title = title
        self.author = author
        self.pages = pages

    def summary(self):
        return f"{self.title} by {self.author}, {self.pages} pages"
    
    def is_long(self):
        if self.pages > 300:
            return True
        else:
            return False

# How would I create an a Book object for “To Kill a Mockingbird”? “Harper Lee” and 336?
tkam = Book("To Kill a Mockingbird", "Harper Lee", 336)
# How would I print out a summary for your Book?
print(tkam.summary())
# Is your book a long book?
print(tkam.is_long())
# Create a new book object of “Catcher in the Rye”?  “J. D. Salinger” and 214.
citr = Book("Catcher in the Rye", "J. D. Salinger", 214)
# Change the title and author to a new book.
citr.title = ":)"
citr.author = "me"
# Print a summary of the new book.
print(citr.summary())

