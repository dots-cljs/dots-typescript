(ns dots.typescript.sorted-readonly-array
  (:refer-clojure :exclude [concat every? filter find keys map reduce some?]))

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
  "Returns a string representation of an array."
  ^js [sorted-readonly-array]
  (.toString ^js sorted-readonly-array))

(defn to-locale-string
  "Returns a string representation of an array. The elements are converted to string using their toLocaleString methods."
  ^js [sorted-readonly-array]
  (.toLocaleString ^js sorted-readonly-array))

(defn concat
  "Combines two or more arrays."
  ^js [sorted-readonly-array & items]
  (.. ^js sorted-readonly-array -concat (apply ^js sorted-readonly-array (to-array items))))

(defn join
  "Adds all the elements of an array separated by the specified separator string."
  (^js [sorted-readonly-array]
   (.join ^js sorted-readonly-array))
  (^js [sorted-readonly-array separator]
   (.join ^js sorted-readonly-array separator)))

(defn slice
  "Returns a section of an array."
  (^js [sorted-readonly-array]
   (.slice ^js sorted-readonly-array))
  (^js [sorted-readonly-array start]
   (.slice ^js sorted-readonly-array start))
  (^js [sorted-readonly-array start end]
   (.slice ^js sorted-readonly-array start end)))

(defn index-of
  "Returns the index of the first occurrence of a value in an array."
  (^js [sorted-readonly-array search-element]
   (.indexOf ^js sorted-readonly-array search-element))
  (^js [sorted-readonly-array search-element from-index]
   (.indexOf ^js sorted-readonly-array search-element from-index)))

(defn last-index-of
  "Returns the index of the last occurrence of a specified value in an array."
  (^js [sorted-readonly-array search-element]
   (.lastIndexOf ^js sorted-readonly-array search-element))
  (^js [sorted-readonly-array search-element from-index]
   (.lastIndexOf ^js sorted-readonly-array search-element from-index)))

(defn every?
  "Determines whether all the members of an array satisfy the specified test."
  (^js [sorted-readonly-array predicate]
   (.every ^js sorted-readonly-array predicate))
  (^js [sorted-readonly-array predicate this-arg]
   (.every ^js sorted-readonly-array predicate this-arg)))

(defn some?
  "Determines whether the specified callback function returns true for any element of an array."
  (^js [sorted-readonly-array predicate]
   (.some ^js sorted-readonly-array predicate))
  (^js [sorted-readonly-array predicate this-arg]
   (.some ^js sorted-readonly-array predicate this-arg)))

(defn for-each
  "Performs the specified action for each element in an array."
  (^js [sorted-readonly-array callbackfn]
   (.forEach ^js sorted-readonly-array callbackfn))
  (^js [sorted-readonly-array callbackfn this-arg]
   (.forEach ^js sorted-readonly-array callbackfn this-arg)))

(defn map
  "Calls a defined callback function on each element of an array, and returns an array that contains the results."
  (^js [sorted-readonly-array callbackfn]
   (.map ^js sorted-readonly-array callbackfn))
  (^js [sorted-readonly-array callbackfn this-arg]
   (.map ^js sorted-readonly-array callbackfn this-arg)))

(defn filter
  "Returns the elements of an array that meet the condition specified in a callback function."
  (^js [sorted-readonly-array predicate]
   (.filter ^js sorted-readonly-array predicate))
  (^js [sorted-readonly-array predicate this-arg]
   (.filter ^js sorted-readonly-array predicate this-arg)))

(defn reduce
  "Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function."
  (^js [sorted-readonly-array callbackfn]
   (.reduce ^js sorted-readonly-array callbackfn))
  (^js [sorted-readonly-array callbackfn initial-value]
   (.reduce ^js sorted-readonly-array callbackfn initial-value)))

(defn reduce-right
  "Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function."
  (^js [sorted-readonly-array callbackfn]
   (.reduceRight ^js sorted-readonly-array callbackfn))
  (^js [sorted-readonly-array callbackfn initial-value]
   (.reduceRight ^js sorted-readonly-array callbackfn initial-value)))

(defn find
  "Returns the value of the first element in the array where predicate is true, and undefined
   otherwise."
  (^js [sorted-readonly-array predicate]
   (.find ^js sorted-readonly-array predicate))
  (^js [sorted-readonly-array predicate this-arg]
   (.find ^js sorted-readonly-array predicate this-arg)))

(defn find-index
  "Returns the index of the first element in the array where predicate is true, and -1
   otherwise."
  (^js [sorted-readonly-array predicate]
   (.findIndex ^js sorted-readonly-array predicate))
  (^js [sorted-readonly-array predicate this-arg]
   (.findIndex ^js sorted-readonly-array predicate this-arg)))

(defn entries
  "Returns an iterable of key, value pairs for every entry in the array"
  ^js [sorted-readonly-array]
  (.entries ^js sorted-readonly-array))

(defn keys
  "Returns an iterable of keys in the array"
  ^js [sorted-readonly-array]
  (.keys ^js sorted-readonly-array))

(defn values
  "Returns an iterable of values in the array"
  ^js [sorted-readonly-array]
  (.values ^js sorted-readonly-array))

(defn includes?
  "Determines whether an array includes a certain element, returning true or false as appropriate."
  (^js [sorted-readonly-array search-element]
   (.includes ^js sorted-readonly-array search-element))
  (^js [sorted-readonly-array search-element from-index]
   (.includes ^js sorted-readonly-array search-element from-index)))

(defn flat-map
  "Calls a defined callback function on each element of an array. Then, flattens the result into
   a new array.
   This is identical to a map followed by flat with depth 1."
  (^js [sorted-readonly-array callback]
   (.flatMap ^js sorted-readonly-array callback))
  (^js [sorted-readonly-array callback this-arg]
   (.flatMap ^js sorted-readonly-array callback this-arg)))

(defn flat
  "Returns a new array with all sub-array elements concatenated into it recursively up to the
   specified depth."
  (^js [sorted-readonly-array]
   (.flat ^js sorted-readonly-array))
  (^js [sorted-readonly-array depth]
   (.flat ^js sorted-readonly-array depth)))
