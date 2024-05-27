(ns dots.typescript.sorted-array
  (:refer-clojure :exclude [concat every? filter map pop reduce reverse some? sort]))

(defn sorted-array-brand
  "**Returns:** `any`"
  ^js [sorted-array]
  (.-" __sortedArrayBrand" ^js sorted-array))

(defn set-sorted-array-brand!
  ^js [sorted-array value]
  (set! (.-" __sortedArrayBrand" ^js sorted-array) value))

(defn length
  "Gets or sets the length of the array. This is a number one higher than the highest index in the array.
   
   **Returns:** `number`"
  ^js [sorted-array]
  (.-length ^js sorted-array))

(defn set-length!
  "Gets or sets the length of the array. This is a number one higher than the highest index in the array."
  ^js [sorted-array value]
  (set! (.-length ^js sorted-array) value))

(defn to-string
  "Returns a string representation of an array.
   
   **Returns:** `string`"
  ^js [sorted-array]
  (.toString ^js sorted-array))

(defn to-locale-string
  "Returns a string representation of an array. The elements are converted to string using their toLocaleString methods.
   
   **Returns:** `string`"
  ^js [sorted-array]
  (.toLocaleString ^js sorted-array))

(defn pop
  "Removes the last element from an array and returns it.
   If the array is empty, undefined is returned and the array is not modified.
   
   **Returns:** `T | undefined`"
  ^js [sorted-array]
  (.pop ^js sorted-array))

(defn push
  "Appends new elements to the end of an array, and returns the new length of the array.
   
   **Parameters:**
   - `items`: `T[]` - New elements to add to the array.
   
   **Returns:** `number`"
  ^js [sorted-array & items]
  (.. ^js sorted-array -push (apply ^js sorted-array (to-array items))))

(defn concat
  "Combines two or more arrays.
   This method returns a new array without modifying any existing arrays.
   
   **Parameters:**
   - `items`: `(T | ConcatArray<T>)[]` - Additional arrays and/or items to add to the end of the array.
   
   **Returns:** `T[]`"
  ^js [sorted-array & items]
  (.. ^js sorted-array -concat (apply ^js sorted-array (to-array items))))

(defn join
  "Adds all the elements of an array into a string, separated by the specified separator string.
   
   **Parameters:**
   - `separator`: `string | undefined` - A string used to separate one element of the array from the next in the resulting string. If omitted, the array elements are separated with a comma.
   
   **Returns:** `string`"
  (^js [sorted-array]
   (.join ^js sorted-array))
  (^js [sorted-array separator]
   (.join ^js sorted-array separator)))

(defn reverse
  "Reverses the elements in an array in place.
   This method mutates the array and returns a reference to the same array.
   
   **Returns:** `T[]`"
  ^js [sorted-array]
  (.reverse ^js sorted-array))

(defn shift
  "Removes the first element from an array and returns it.
   If the array is empty, undefined is returned and the array is not modified.
   
   **Returns:** `T | undefined`"
  ^js [sorted-array]
  (.shift ^js sorted-array))

(defn slice
  "Returns a copy of a section of an array.
   For both start and end, a negative index can be used to indicate an offset from the end of the array.
   For example, -2 refers to the second to last element of the array.
   
   **Parameters:**
   - `start`: `number | undefined` - The beginning index of the specified portion of the array.
   If start is undefined, then the slice begins at index 0.
   - `end`: `number | undefined` - The end index of the specified portion of the array. This is exclusive of the element at the index 'end'.
   If end is undefined, then the slice extends to the end of the array.
   
   **Returns:** `T[]`"
  (^js [sorted-array]
   (.slice ^js sorted-array))
  (^js [sorted-array start]
   (.slice ^js sorted-array start))
  (^js [sorted-array start end]
   (.slice ^js sorted-array start end)))

(defn sort
  "Sorts an array in place.
   This method mutates the array and returns a reference to the same array.
   
   **Parameters:**
   - `compare-fn`: `((a: T, b: T) => number) | undefined` - Function used to determine the order of the elements. It is expected to return
   a negative value if the first argument is less than the second argument, zero if they're equal, and a positive
   value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
   ```ts
   [11,2,22,1].sort((a, b) => a - b)
   ```
   
   **Returns:** `SortedArray<T>`"
  (^js [sorted-array]
   (.sort ^js sorted-array))
  (^js [sorted-array compare-fn]
   (.sort ^js sorted-array compare-fn)))

(defn splice
  "Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
   
   **Parameters:**
   - `start`: `number` - The zero-based location in the array from which to start removing elements.
   - `delete-count`: `number` - The number of elements to remove.
   - `items`: `T[]` - Elements to insert into the array in place of the deleted elements.
   
   **Returns:** `T[]` - An array containing the elements that were deleted."
  {:arglists '([sorted-array start]
               [sorted-array start & delete-count]
               [sorted-array start delete-count & items])}
  (^js [sorted-array start]
   (.splice ^js sorted-array start))
  (^js [a b c & more]
   (.. ^js a -splice (apply ^js a (to-array (list* b c more))))))

(defn unshift
  "Inserts new elements at the start of an array, and returns the new length of the array.
   
   **Parameters:**
   - `items`: `T[]` - Elements to insert at the start of the array.
   
   **Returns:** `number`"
  ^js [sorted-array & items]
  (.. ^js sorted-array -unshift (apply ^js sorted-array (to-array items))))

(defn index-of
  "Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
   
   **Parameters:**
   - `search-element`: `T` - The value to locate in the array.
   - `from-index`: `number | undefined` - The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
   
   **Returns:** `number`"
  (^js [sorted-array search-element]
   (.indexOf ^js sorted-array search-element))
  (^js [sorted-array search-element from-index]
   (.indexOf ^js sorted-array search-element from-index)))

(defn last-index-of
  "Returns the index of the last occurrence of a specified value in an array, or -1 if it is not present.
   
   **Parameters:**
   - `search-element`: `T` - The value to locate in the array.
   - `from-index`: `number | undefined` - The array index at which to begin searching backward. If fromIndex is omitted, the search starts at the last index in the array.
   
   **Returns:** `number`"
  (^js [sorted-array search-element]
   (.lastIndexOf ^js sorted-array search-element))
  (^js [sorted-array search-element from-index]
   (.lastIndexOf ^js sorted-array search-element from-index)))

(defn every?
  "Determines whether all the members of an array satisfy the specified test.
   
   **Parameters:**
   - `predicate`: `(value: T, index: number, array: T[]) => unknown` - A function that accepts up to three arguments. The every method calls
   the predicate function for each element in the array until the predicate returns a value
   which is coercible to the Boolean value false, or until the end of the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the predicate function.
   If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `boolean`"
  (^js [sorted-array predicate]
   (.every ^js sorted-array predicate))
  (^js [sorted-array predicate this-arg]
   (.every ^js sorted-array predicate this-arg)))

(defn some?
  "Determines whether the specified callback function returns true for any element of an array.
   
   **Parameters:**
   - `predicate`: `(value: T, index: number, array: T[]) => unknown` - A function that accepts up to three arguments. The some method calls
   the predicate function for each element in the array until the predicate returns a value
   which is coercible to the Boolean value true, or until the end of the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the predicate function.
   If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `boolean`"
  (^js [sorted-array predicate]
   (.some ^js sorted-array predicate))
  (^js [sorted-array predicate this-arg]
   (.some ^js sorted-array predicate this-arg)))

(defn for-each
  "Performs the specified action for each element in an array.
   
   **Parameters:**
   - `callbackfn`: `(value: T, index: number, array: T[]) => void` - A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `void`"
  (^js [sorted-array callbackfn]
   (.forEach ^js sorted-array callbackfn))
  (^js [sorted-array callbackfn this-arg]
   (.forEach ^js sorted-array callbackfn this-arg)))

(defn map
  "Calls a defined callback function on each element of an array, and returns an array that contains the results.
   
   **Parameters:**
   - `callbackfn`: `(value: T, index: number, array: T[]) => U` - A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `U[]`"
  (^js [sorted-array callbackfn]
   (.map ^js sorted-array callbackfn))
  (^js [sorted-array callbackfn this-arg]
   (.map ^js sorted-array callbackfn this-arg)))

(defn filter
  "Returns the elements of an array that meet the condition specified in a callback function.
   
   **Parameters:**
   - `predicate`: `(value: T, index: number, array: T[]) => unknown` - A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `T[]`"
  (^js [sorted-array predicate]
   (.filter ^js sorted-array predicate))
  (^js [sorted-array predicate this-arg]
   (.filter ^js sorted-array predicate this-arg)))

(defn reduce
  "Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
   
   **Parameters:**
   - `callbackfn`: `(previousValue: U, currentValue: T, currentIndex: number, array: T[]) => U` - A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
   - `initial-value`: `U` - If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
   
   **Returns:** `U`"
  (^js [sorted-array callbackfn]
   (.reduce ^js sorted-array callbackfn))
  (^js [sorted-array callbackfn initial-value]
   (.reduce ^js sorted-array callbackfn initial-value)))

(defn reduce-right
  "Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
   
   **Parameters:**
   - `callbackfn`: `(previousValue: U, currentValue: T, currentIndex: number, array: T[]) => U` - A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
   - `initial-value`: `U` - If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
   
   **Returns:** `U`"
  (^js [sorted-array callbackfn]
   (.reduceRight ^js sorted-array callbackfn))
  (^js [sorted-array callbackfn initial-value]
   (.reduceRight ^js sorted-array callbackfn initial-value)))
