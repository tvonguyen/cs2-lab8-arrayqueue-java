1. why do we need an explicit constructor?
    a. Without an explicit constructor, you would not be able to edit the capacity
2. What happens when you offer an item to a full FixedArrayQueue?
    a. It returns false as size won't be less than capacity.
3. What happens when you poll an empty FixedArrayQueue?
    a. It returns null because !isEmpty isn't true.
4. What is the time and (extra) space complexity of each of the FixedArrayQueue methods?
    Both O(n) linear