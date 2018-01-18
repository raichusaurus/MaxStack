# MaxStack
Exercise to create a class that extends Stack and easily returns the max element in the stack.

My intial concerns about duplicating data by creating an additional stack data structure in the MaxStack class
were unfounded.  When adding an object to both the parent stack and the internal max stack, both stacks are
holding a reference to the same object(on the heap) since we are not calling new() and creating a duplicate
object.
