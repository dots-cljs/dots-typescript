(ns dots.typescript.node-array
  (:refer-clojure :exclude [concat every? filter find keys map reduce some?]))

(defn has-trailing-comma?
  ^js [node-array]
  (.-hasTrailingComma ^js node-array))

(defn length
  "Gets the length of the array. This is a number one higher than the highest element defined in an array."
  ^js [node-array]
  (.-length ^js node-array))

(defn to-string
  "Returns a string representation of an array."
  ^js [node-array]
  (.toString ^js node-array))

(defn to-locale-string
  "Returns a string representation of an array. The elements are converted to string using their toLocaleString methods."
  ^js [node-array]
  (.toLocaleString ^js node-array))

(defn concat
  "Combines two or more arrays."
  ^js [node-array & items]
  (.. ^js node-array -concat (apply ^js node-array (to-array items))))

(defn join
  "Adds all the elements of an array separated by the specified separator string."
  (^js [node-array]
   (.join ^js node-array))
  (^js [node-array separator]
   (.join ^js node-array separator)))

(defn slice
  "Returns a section of an array."
  (^js [node-array]
   (.slice ^js node-array))
  (^js [node-array start]
   (.slice ^js node-array start))
  (^js [node-array start end]
   (.slice ^js node-array start end)))

(defn index-of
  "Returns the index of the first occurrence of a value in an array."
  (^js [node-array search-element]
   (.indexOf ^js node-array search-element))
  (^js [node-array search-element from-index]
   (.indexOf ^js node-array search-element from-index)))

(defn last-index-of
  "Returns the index of the last occurrence of a specified value in an array."
  (^js [node-array search-element]
   (.lastIndexOf ^js node-array search-element))
  (^js [node-array search-element from-index]
   (.lastIndexOf ^js node-array search-element from-index)))

(defn every?
  "Determines whether all the members of an array satisfy the specified test."
  (^js [node-array predicate]
   (.every ^js node-array predicate))
  (^js [node-array predicate this-arg]
   (.every ^js node-array predicate this-arg)))

(defn some?
  "Determines whether the specified callback function returns true for any element of an array."
  (^js [node-array predicate]
   (.some ^js node-array predicate))
  (^js [node-array predicate this-arg]
   (.some ^js node-array predicate this-arg)))

(defn for-each
  "Performs the specified action for each element in an array."
  (^js [node-array callbackfn]
   (.forEach ^js node-array callbackfn))
  (^js [node-array callbackfn this-arg]
   (.forEach ^js node-array callbackfn this-arg)))

(defn map
  "Calls a defined callback function on each element of an array, and returns an array that contains the results."
  (^js [node-array callbackfn]
   (.map ^js node-array callbackfn))
  (^js [node-array callbackfn this-arg]
   (.map ^js node-array callbackfn this-arg)))

(defn filter
  "Returns the elements of an array that meet the condition specified in a callback function."
  (^js [node-array predicate]
   (.filter ^js node-array predicate))
  (^js [node-array predicate this-arg]
   (.filter ^js node-array predicate this-arg)))

(defn reduce
  "Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function."
  (^js [node-array callbackfn]
   (.reduce ^js node-array callbackfn))
  (^js [node-array callbackfn initial-value]
   (.reduce ^js node-array callbackfn initial-value)))

(defn reduce-right
  "Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function."
  (^js [node-array callbackfn]
   (.reduceRight ^js node-array callbackfn))
  (^js [node-array callbackfn initial-value]
   (.reduceRight ^js node-array callbackfn initial-value)))

(defn find
  "Returns the value of the first element in the array where predicate is true, and undefined
   otherwise."
  (^js [node-array predicate]
   (.find ^js node-array predicate))
  (^js [node-array predicate this-arg]
   (.find ^js node-array predicate this-arg)))

(defn find-index
  "Returns the index of the first element in the array where predicate is true, and -1
   otherwise."
  (^js [node-array predicate]
   (.findIndex ^js node-array predicate))
  (^js [node-array predicate this-arg]
   (.findIndex ^js node-array predicate this-arg)))

(defn entries
  "Returns an iterable of key, value pairs for every entry in the array"
  ^js [node-array]
  (.entries ^js node-array))

(defn keys
  "Returns an iterable of keys in the array"
  ^js [node-array]
  (.keys ^js node-array))

(defn values
  "Returns an iterable of values in the array"
  ^js [node-array]
  (.values ^js node-array))

(defn includes?
  "Determines whether an array includes a certain element, returning true or false as appropriate."
  (^js [node-array search-element]
   (.includes ^js node-array search-element))
  (^js [node-array search-element from-index]
   (.includes ^js node-array search-element from-index)))

(defn flat-map
  "Calls a defined callback function on each element of an array. Then, flattens the result into
   a new array.
   This is identical to a map followed by flat with depth 1."
  (^js [node-array callback]
   (.flatMap ^js node-array callback))
  (^js [node-array callback this-arg]
   (.flatMap ^js node-array callback this-arg)))

(defn flat
  "Returns a new array with all sub-array elements concatenated into it recursively up to the
   specified depth."
  (^js [node-array]
   (.flat ^js node-array))
  (^js [node-array depth]
   (.flat ^js node-array depth)))

(defn at
  "Takes an integer value and returns the item at that index,
   allowing for positive and negative integers.
   Negative integers count back from the last item in the array."
  ^js [node-array index]
  (.at ^js node-array index))

(defn pos
  ^js [node-array]
  (.-pos ^js node-array))

(defn end
  ^js [node-array]
  (.-end ^js node-array))
