(ns dots.typescript.sorted-readonly-array
  (:refer-clojure :exclude [concat every? filter map reduce some?]))

(defn sorted-array-brand
  ^js [sorted-readonly-array]
  (.-" __sortedArrayBrand" ^js sorted-readonly-array))

(defn set-sorted-array-brand!
  ^js [sorted-readonly-array value]
  (set! (.-" __sortedArrayBrand" ^js sorted-readonly-array) value))

(defn length
  "Gets the length of the array. This is a number one higher than the highest element defined in an array."
  ^js [sorted-readonly-array]
  (.-length ^js sorted-readonly-array))

(defn to-string
  "Returns a string representation of an array.
   
   **Returns:** `string`"
  ^js [sorted-readonly-array]
  (.toString ^js sorted-readonly-array))

(defn to-locale-string
  "Returns a string representation of an array. The elements are converted to string using their toLocaleString methods.
   
   **Returns:** `string`"
  ^js [sorted-readonly-array]
  (.toLocaleString ^js sorted-readonly-array))

(defn concat
  "Combines two or more arrays.
   
   **Parameters:**
   - `items`: `(T | ConcatArray<T>)[]` - Additional items to add to the end of array1.
   
   **Returns:** `T[]`"
  ^js [sorted-readonly-array & items]
  (.. ^js sorted-readonly-array -concat (apply ^js sorted-readonly-array (to-array items))))

(defn join
  "Adds all the elements of an array separated by the specified separator string.
   
   **Parameters:**
   - `separator`: `string | undefined` - A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
   
   **Returns:** `string`"
  (^js [sorted-readonly-array]
   (.join ^js sorted-readonly-array))
  (^js [sorted-readonly-array separator]
   (.join ^js sorted-readonly-array separator)))

(defn slice
  "Returns a section of an array.
   
   **Parameters:**
   - `start`: `number | undefined` - The beginning of the specified portion of the array.
   - `end`: `number | undefined` - The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
   
   **Returns:** `T[]`"
  (^js [sorted-readonly-array]
   (.slice ^js sorted-readonly-array))
  (^js [sorted-readonly-array start]
   (.slice ^js sorted-readonly-array start))
  (^js [sorted-readonly-array start end]
   (.slice ^js sorted-readonly-array start end)))

(defn index-of
  "Returns the index of the first occurrence of a value in an array.
   
   **Parameters:**
   - `search-element`: `T` - The value to locate in the array.
   - `from-index`: `number | undefined` - The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
   
   **Returns:** `number`"
  (^js [sorted-readonly-array search-element]
   (.indexOf ^js sorted-readonly-array search-element))
  (^js [sorted-readonly-array search-element from-index]
   (.indexOf ^js sorted-readonly-array search-element from-index)))

(defn last-index-of
  "Returns the index of the last occurrence of a specified value in an array.
   
   **Parameters:**
   - `search-element`: `T` - The value to locate in the array.
   - `from-index`: `number | undefined` - The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
   
   **Returns:** `number`"
  (^js [sorted-readonly-array search-element]
   (.lastIndexOf ^js sorted-readonly-array search-element))
  (^js [sorted-readonly-array search-element from-index]
   (.lastIndexOf ^js sorted-readonly-array search-element from-index)))

(defn every?
  "Determines whether all the members of an array satisfy the specified test.
   
   **Parameters:**
   - `predicate`: `(value: T, index: number, array: readonly T[]) => unknown` - A function that accepts up to three arguments. The every method calls
   the predicate function for each element in the array until the predicate returns a value
   which is coercible to the Boolean value false, or until the end of the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the predicate function.
   If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `boolean`"
  (^js [sorted-readonly-array predicate]
   (.every ^js sorted-readonly-array predicate))
  (^js [sorted-readonly-array predicate this-arg]
   (.every ^js sorted-readonly-array predicate this-arg)))

(defn some?
  "Determines whether the specified callback function returns true for any element of an array.
   
   **Parameters:**
   - `predicate`: `(value: T, index: number, array: readonly T[]) => unknown` - A function that accepts up to three arguments. The some method calls
   the predicate function for each element in the array until the predicate returns a value
   which is coercible to the Boolean value true, or until the end of the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the predicate function.
   If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `boolean`"
  (^js [sorted-readonly-array predicate]
   (.some ^js sorted-readonly-array predicate))
  (^js [sorted-readonly-array predicate this-arg]
   (.some ^js sorted-readonly-array predicate this-arg)))

(defn for-each
  "Performs the specified action for each element in an array.
   
   **Parameters:**
   - `callbackfn`: `(value: T, index: number, array: readonly T[]) => void` - A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `void`"
  (^js [sorted-readonly-array callbackfn]
   (.forEach ^js sorted-readonly-array callbackfn))
  (^js [sorted-readonly-array callbackfn this-arg]
   (.forEach ^js sorted-readonly-array callbackfn this-arg)))

(defn map
  "Calls a defined callback function on each element of an array, and returns an array that contains the results.
   
   **Parameters:**
   - `callbackfn`: `(value: T, index: number, array: readonly T[]) => U` - A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `U[]`"
  (^js [sorted-readonly-array callbackfn]
   (.map ^js sorted-readonly-array callbackfn))
  (^js [sorted-readonly-array callbackfn this-arg]
   (.map ^js sorted-readonly-array callbackfn this-arg)))

(defn filter
  "Returns the elements of an array that meet the condition specified in a callback function.
   
   **Parameters:**
   - `predicate`: `(value: T, index: number, array: readonly T[]) => unknown` - A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `T[]`"
  (^js [sorted-readonly-array predicate]
   (.filter ^js sorted-readonly-array predicate))
  (^js [sorted-readonly-array predicate this-arg]
   (.filter ^js sorted-readonly-array predicate this-arg)))

(defn reduce
  "Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
   
   **Parameters:**
   - `callbackfn`: `(previousValue: U, currentValue: T, currentIndex: number, array: readonly T[]) => U` - A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
   - `initial-value`: `U` - If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
   
   **Returns:** `U`"
  (^js [sorted-readonly-array callbackfn]
   (.reduce ^js sorted-readonly-array callbackfn))
  (^js [sorted-readonly-array callbackfn initial-value]
   (.reduce ^js sorted-readonly-array callbackfn initial-value)))

(defn reduce-right
  "Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
   
   **Parameters:**
   - `callbackfn`: `(previousValue: U, currentValue: T, currentIndex: number, array: readonly T[]) => U` - A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
   - `initial-value`: `U` - If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
   
   **Returns:** `U`"
  (^js [sorted-readonly-array callbackfn]
   (.reduceRight ^js sorted-readonly-array callbackfn))
  (^js [sorted-readonly-array callbackfn initial-value]
   (.reduceRight ^js sorted-readonly-array callbackfn initial-value)))
