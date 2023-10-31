(ns dots.typescript.sorted-array
  (:refer-clojure :exclude [concat every? filter find keys map pop reduce reverse some? sort]))

(defn sorted-array-brand
  ^js [sorted-array]
  (.-" __sortedArrayBrand" ^js sorted-array))

(defn set-sorted-array-brand!
  ^js [sorted-array value]
  (set! (.-" __sortedArrayBrand" ^js sorted-array) value))

(defn length
  "Gets or sets the length of the array. This is a number one higher than the highest index in the array."
  ^js [sorted-array]
  (.-length ^js sorted-array))

(defn set-length!
  "Gets or sets the length of the array. This is a number one higher than the highest index in the array."
  ^js [sorted-array value]
  (set! (.-length ^js sorted-array) value))

(defn to-string
  "Returns a string representation of an array."
  ^js [sorted-array]
  (.toString ^js sorted-array))

(defn to-locale-string
  "Returns a string representation of an array. The elements are converted to string using their toLocaleString methods."
  ^js [sorted-array]
  (.toLocaleString ^js sorted-array))

(defn pop
  "Removes the last element from an array and returns it.
   If the array is empty, undefined is returned and the array is not modified."
  ^js [sorted-array]
  (.pop ^js sorted-array))

(defn push
  "Appends new elements to the end of an array, and returns the new length of the array."
  ^js [sorted-array & items]
  (.. ^js sorted-array -push (apply ^js sorted-array (to-array items))))

(defn concat
  "Combines two or more arrays.
   This method returns a new array without modifying any existing arrays."
  ^js [sorted-array & items]
  (.. ^js sorted-array -concat (apply ^js sorted-array (to-array items))))

(defn join
  "Adds all the elements of an array into a string, separated by the specified separator string."
  (^js [sorted-array]
   (.join ^js sorted-array))
  (^js [sorted-array separator]
   (.join ^js sorted-array separator)))

(defn reverse
  "Reverses the elements in an array in place.
   This method mutates the array and returns a reference to the same array."
  ^js [sorted-array]
  (.reverse ^js sorted-array))

(defn shift
  "Removes the first element from an array and returns it.
   If the array is empty, undefined is returned and the array is not modified."
  ^js [sorted-array]
  (.shift ^js sorted-array))

(defn slice
  "Returns a copy of a section of an array.
   For both start and end, a negative index can be used to indicate an offset from the end of the array.
   For example, -2 refers to the second to last element of the array."
  (^js [sorted-array]
   (.slice ^js sorted-array))
  (^js [sorted-array start]
   (.slice ^js sorted-array start))
  (^js [sorted-array start end]
   (.slice ^js sorted-array start end)))

(defn sort
  "Sorts an array in place.
   This method mutates the array and returns a reference to the same array."
  (^js [sorted-array]
   (.sort ^js sorted-array))
  (^js [sorted-array compare-fn]
   (.sort ^js sorted-array compare-fn)))

(defn splice
  "Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements."
  {:arglists '([sorted-array start]
               [sorted-array start & delete-count]
               [sorted-array start delete-count & items])}
  (^js [sorted-array start]
   (.splice ^js sorted-array start))
  (^js [a b c & more]
   (.. ^js a -splice (apply ^js a (to-array (list* b c more))))))

(defn unshift
  "Inserts new elements at the start of an array, and returns the new length of the array."
  ^js [sorted-array & items]
  (.. ^js sorted-array -unshift (apply ^js sorted-array (to-array items))))

(defn index-of
  "Returns the index of the first occurrence of a value in an array, or -1 if it is not present."
  (^js [sorted-array search-element]
   (.indexOf ^js sorted-array search-element))
  (^js [sorted-array search-element from-index]
   (.indexOf ^js sorted-array search-element from-index)))

(defn last-index-of
  "Returns the index of the last occurrence of a specified value in an array, or -1 if it is not present."
  (^js [sorted-array search-element]
   (.lastIndexOf ^js sorted-array search-element))
  (^js [sorted-array search-element from-index]
   (.lastIndexOf ^js sorted-array search-element from-index)))

(defn every?
  "Determines whether all the members of an array satisfy the specified test."
  (^js [sorted-array predicate]
   (.every ^js sorted-array predicate))
  (^js [sorted-array predicate this-arg]
   (.every ^js sorted-array predicate this-arg)))

(defn some?
  "Determines whether the specified callback function returns true for any element of an array."
  (^js [sorted-array predicate]
   (.some ^js sorted-array predicate))
  (^js [sorted-array predicate this-arg]
   (.some ^js sorted-array predicate this-arg)))

(defn for-each
  "Performs the specified action for each element in an array."
  (^js [sorted-array callbackfn]
   (.forEach ^js sorted-array callbackfn))
  (^js [sorted-array callbackfn this-arg]
   (.forEach ^js sorted-array callbackfn this-arg)))

(defn map
  "Calls a defined callback function on each element of an array, and returns an array that contains the results."
  (^js [sorted-array callbackfn]
   (.map ^js sorted-array callbackfn))
  (^js [sorted-array callbackfn this-arg]
   (.map ^js sorted-array callbackfn this-arg)))

(defn filter
  "Returns the elements of an array that meet the condition specified in a callback function."
  (^js [sorted-array predicate]
   (.filter ^js sorted-array predicate))
  (^js [sorted-array predicate this-arg]
   (.filter ^js sorted-array predicate this-arg)))

(defn reduce
  "Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function."
  (^js [sorted-array callbackfn]
   (.reduce ^js sorted-array callbackfn))
  (^js [sorted-array callbackfn initial-value]
   (.reduce ^js sorted-array callbackfn initial-value)))

(defn reduce-right
  "Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function."
  (^js [sorted-array callbackfn]
   (.reduceRight ^js sorted-array callbackfn))
  (^js [sorted-array callbackfn initial-value]
   (.reduceRight ^js sorted-array callbackfn initial-value)))

(defn find
  "Returns the value of the first element in the array where predicate is true, and undefined
   otherwise."
  (^js [sorted-array predicate]
   (.find ^js sorted-array predicate))
  (^js [sorted-array predicate this-arg]
   (.find ^js sorted-array predicate this-arg)))

(defn find-index
  "Returns the index of the first element in the array where predicate is true, and -1
   otherwise."
  (^js [sorted-array predicate]
   (.findIndex ^js sorted-array predicate))
  (^js [sorted-array predicate this-arg]
   (.findIndex ^js sorted-array predicate this-arg)))

(defn fill
  "Changes all array elements from `start` to `end` index to a static `value` and returns the modified array"
  (^js [sorted-array value]
   (.fill ^js sorted-array value))
  (^js [sorted-array value start]
   (.fill ^js sorted-array value start))
  (^js [sorted-array value start end]
   (.fill ^js sorted-array value start end)))

(defn copy-within
  "Returns the this object after copying a section of the array identified by start and end
   to the same array starting at position target"
  (^js [sorted-array target start]
   (.copyWithin ^js sorted-array target start))
  (^js [sorted-array target start end]
   (.copyWithin ^js sorted-array target start end)))

(defn entries
  "Returns an iterable of key, value pairs for every entry in the array"
  ^js [sorted-array]
  (.entries ^js sorted-array))

(defn keys
  "Returns an iterable of keys in the array"
  ^js [sorted-array]
  (.keys ^js sorted-array))

(defn values
  "Returns an iterable of values in the array"
  ^js [sorted-array]
  (.values ^js sorted-array))

(defn includes?
  "Determines whether an array includes a certain element, returning true or false as appropriate."
  (^js [sorted-array search-element]
   (.includes ^js sorted-array search-element))
  (^js [sorted-array search-element from-index]
   (.includes ^js sorted-array search-element from-index)))

(defn flat-map
  "Calls a defined callback function on each element of an array. Then, flattens the result into
   a new array.
   This is identical to a map followed by flat with depth 1."
  (^js [sorted-array callback]
   (.flatMap ^js sorted-array callback))
  (^js [sorted-array callback this-arg]
   (.flatMap ^js sorted-array callback this-arg)))

(defn flat
  "Returns a new array with all sub-array elements concatenated into it recursively up to the
   specified depth."
  (^js [sorted-array]
   (.flat ^js sorted-array))
  (^js [sorted-array depth]
   (.flat ^js sorted-array depth)))

(defn at
  "Takes an integer value and returns the item at that index,
   allowing for positive and negative integers.
   Negative integers count back from the last item in the array."
  ^js [sorted-array index]
  (.at ^js sorted-array index))
