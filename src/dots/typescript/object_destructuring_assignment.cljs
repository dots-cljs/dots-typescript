(ns dots.typescript.object-destructuring-assignment)

(defn left
  ^js [object-destructuring-assignment]
  (.-left ^js object-destructuring-assignment))

(defn operator-token
  ^js [object-destructuring-assignment]
  (.-operatorToken ^js object-destructuring-assignment))

(defn kind
  ^js [object-destructuring-assignment]
  (.-kind ^js object-destructuring-assignment))

(defn right
  ^js [object-destructuring-assignment]
  (.-right ^js object-destructuring-assignment))

(defn flags
  ^js [object-destructuring-assignment]
  (.-flags ^js object-destructuring-assignment))

(defn parent
  ^js [object-destructuring-assignment]
  (.-parent ^js object-destructuring-assignment))

(defn source-file
  ^js [object-destructuring-assignment]
  (.getSourceFile ^js object-destructuring-assignment))

(defn child-count
  (^js [object-destructuring-assignment]
   (.getChildCount ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getChildCount ^js object-destructuring-assignment source-file)))

(defn child-at
  (^js [object-destructuring-assignment index]
   (.getChildAt ^js object-destructuring-assignment index))
  (^js [object-destructuring-assignment index source-file]
   (.getChildAt ^js object-destructuring-assignment index source-file)))

(defn children
  (^js [object-destructuring-assignment]
   (.getChildren ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getChildren ^js object-destructuring-assignment source-file)))

(defn start
  (^js [object-destructuring-assignment]
   (.getStart ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getStart ^js object-destructuring-assignment source-file))
  (^js [object-destructuring-assignment source-file include-js-doc-comment?]
   (.getStart ^js object-destructuring-assignment source-file include-js-doc-comment?)))

(defn full-start
  ^js [object-destructuring-assignment]
  (.getFullStart ^js object-destructuring-assignment))

(defn get-end
  ^js [object-destructuring-assignment]
  (.getEnd ^js object-destructuring-assignment))

(defn width
  (^js [object-destructuring-assignment]
   (.getWidth ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getWidth ^js object-destructuring-assignment source-file)))

(defn full-width
  ^js [object-destructuring-assignment]
  (.getFullWidth ^js object-destructuring-assignment))

(defn leading-trivia-width
  (^js [object-destructuring-assignment]
   (.getLeadingTriviaWidth ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getLeadingTriviaWidth ^js object-destructuring-assignment source-file)))

(defn full-text
  (^js [object-destructuring-assignment]
   (.getFullText ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getFullText ^js object-destructuring-assignment source-file)))

(defn text
  (^js [object-destructuring-assignment]
   (.getText ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getText ^js object-destructuring-assignment source-file)))

(defn first-token
  (^js [object-destructuring-assignment]
   (.getFirstToken ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getFirstToken ^js object-destructuring-assignment source-file)))

(defn last-token
  (^js [object-destructuring-assignment]
   (.getLastToken ^js object-destructuring-assignment))
  (^js [object-destructuring-assignment source-file]
   (.getLastToken ^js object-destructuring-assignment source-file)))

(defn for-each-child
  (^js [object-destructuring-assignment cb-node]
   (.forEachChild ^js object-destructuring-assignment cb-node))
  (^js [object-destructuring-assignment cb-node cb-node-array]
   (.forEachChild ^js object-destructuring-assignment cb-node cb-node-array)))

(defn pos
  ^js [object-destructuring-assignment]
  (.-pos ^js object-destructuring-assignment))

(defn end
  ^js [object-destructuring-assignment]
  (.-end ^js object-destructuring-assignment))
