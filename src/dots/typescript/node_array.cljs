(ns dots.typescript.node-array
  (:refer-clojure :exclude [concat every? filter map reduce some?]))

(defn has-trailing-comma?
  "**Returns:** `boolean`"
  ^js [node-array]
  (.-hasTrailingComma ^js node-array))

(defn length
  "Gets the length of the array. This is a number one higher than the highest element defined in an array.
   
   **Returns:** `number`"
  ^js [node-array]
  (.-length ^js node-array))

(defn to-string
  "Returns a string representation of an array.
   
   **Returns:** `string`"
  ^js [node-array]
  (.toString ^js node-array))

(defn to-locale-string
  "Returns a string representation of an array. The elements are converted to string using their toLocaleString methods.
   
   **Returns:** `string`"
  ^js [node-array]
  (.toLocaleString ^js node-array))

(defn concat
  "Combines two or more arrays.
   
   **Parameters:**
   - `items`: `(T | ConcatArray<T>)[]` - Additional items to add to the end of array1.
   
   **Returns:** `T[]`"
  ^js [node-array & items]
  (.. ^js node-array -concat (apply ^js node-array (to-array items))))

(defn join
  "Adds all the elements of an array separated by the specified separator string.
   
   **Parameters:**
   - `separator`: `string | undefined` - A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
   
   **Returns:** `string`"
  (^js [node-array]
   (.join ^js node-array))
  (^js [node-array separator]
   (.join ^js node-array separator)))

(defn slice
  "Returns a section of an array.
   
   **Parameters:**
   - `start`: `number | undefined` - The beginning of the specified portion of the array.
   - `end`: `number | undefined` - The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
   
   **Returns:** `T[]`"
  (^js [node-array]
   (.slice ^js node-array))
  (^js [node-array start]
   (.slice ^js node-array start))
  (^js [node-array start end]
   (.slice ^js node-array start end)))

(defn index-of
  "Returns the index of the first occurrence of a value in an array.
   
   **Parameters:**
   - `search-element`: `T` - The value to locate in the array.
   - `from-index`: `number | undefined` - The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
   
   **Returns:** `number`"
  (^js [node-array search-element]
   (.indexOf ^js node-array search-element))
  (^js [node-array search-element from-index]
   (.indexOf ^js node-array search-element from-index)))

(defn last-index-of
  "Returns the index of the last occurrence of a specified value in an array.
   
   **Parameters:**
   - `search-element`: `T` - The value to locate in the array.
   - `from-index`: `number | undefined` - The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
   
   **Returns:** `number`"
  (^js [node-array search-element]
   (.lastIndexOf ^js node-array search-element))
  (^js [node-array search-element from-index]
   (.lastIndexOf ^js node-array search-element from-index)))

(defn every?
  "Determines whether all the members of an array satisfy the specified test.
   
   **Parameters:**
   - `predicate`: `(value: T, index: number, array: readonly T[]) => unknown` - A function that accepts up to three arguments. The every method calls
   the predicate function for each element in the array until the predicate returns a value
   which is coercible to the Boolean value false, or until the end of the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the predicate function.
   If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `boolean`"
  (^js [node-array predicate]
   (.every ^js node-array predicate))
  (^js [node-array predicate this-arg]
   (.every ^js node-array predicate this-arg)))

(defn some?
  "Determines whether the specified callback function returns true for any element of an array.
   
   **Parameters:**
   - `predicate`: `(value: T, index: number, array: readonly T[]) => unknown` - A function that accepts up to three arguments. The some method calls
   the predicate function for each element in the array until the predicate returns a value
   which is coercible to the Boolean value true, or until the end of the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the predicate function.
   If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `boolean`"
  (^js [node-array predicate]
   (.some ^js node-array predicate))
  (^js [node-array predicate this-arg]
   (.some ^js node-array predicate this-arg)))

(defn for-each
  "Performs the specified action for each element in an array.
   
   **Parameters:**
   - `callbackfn`: `(value: T, index: number, array: readonly T[]) => void` - A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `void`"
  (^js [node-array callbackfn]
   (.forEach ^js node-array callbackfn))
  (^js [node-array callbackfn this-arg]
   (.forEach ^js node-array callbackfn this-arg)))

(defn map
  "Calls a defined callback function on each element of an array, and returns an array that contains the results.
   
   **Parameters:**
   - `callbackfn`: `(value: T, index: number, array: readonly T[]) => U` - A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `U[]`"
  (^js [node-array callbackfn]
   (.map ^js node-array callbackfn))
  (^js [node-array callbackfn this-arg]
   (.map ^js node-array callbackfn this-arg)))

(defn filter
  "Returns the elements of an array that meet the condition specified in a callback function.
   
   **Parameters:**
   - `predicate`: `(value: T, index: number, array: readonly T[]) => unknown` - A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
   - `this-arg`: `any` - An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
   
   **Returns:** `T[]`"
  (^js [node-array predicate]
   (.filter ^js node-array predicate))
  (^js [node-array predicate this-arg]
   (.filter ^js node-array predicate this-arg)))

(defn reduce
  "Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
   
   **Parameters:**
   - `callbackfn`: `(previousValue: U, currentValue: T, currentIndex: number, array: readonly T[]) => U` - A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
   - `initial-value`: `U` - If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
   
   **Returns:** `U`"
  (^js [node-array callbackfn]
   (.reduce ^js node-array callbackfn))
  (^js [node-array callbackfn initial-value]
   (.reduce ^js node-array callbackfn initial-value)))

(defn reduce-right
  "Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
   
   **Parameters:**
   - `callbackfn`: `(previousValue: U, currentValue: T, currentIndex: number, array: readonly T[]) => U` - A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
   - `initial-value`: `U` - If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
   
   **Returns:** `U`"
  (^js [node-array callbackfn]
   (.reduceRight ^js node-array callbackfn))
  (^js [node-array callbackfn initial-value]
   (.reduceRight ^js node-array callbackfn initial-value)))

(defn pos
  "**Returns:** `number`"
  ^js [node-array]
  (.-pos ^js node-array))

(defn end
  "**Returns:** `number`"
  ^js [node-array]
  (.-end ^js node-array))
