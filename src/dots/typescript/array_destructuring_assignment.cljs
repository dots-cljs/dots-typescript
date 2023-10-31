(ns dots.typescript.array-destructuring-assignment)

(defn left
  ^js [array-destructuring-assignment]
  (.-left ^js array-destructuring-assignment))

(defn operator-token
  ^js [array-destructuring-assignment]
  (.-operatorToken ^js array-destructuring-assignment))

(defn kind
  ^js [array-destructuring-assignment]
  (.-kind ^js array-destructuring-assignment))

(defn right
  ^js [array-destructuring-assignment]
  (.-right ^js array-destructuring-assignment))

(defn flags
  ^js [array-destructuring-assignment]
  (.-flags ^js array-destructuring-assignment))

(defn parent
  ^js [array-destructuring-assignment]
  (.-parent ^js array-destructuring-assignment))

(defn source-file
  ^js [array-destructuring-assignment]
  (.getSourceFile ^js array-destructuring-assignment))

(defn child-count
  (^js [array-destructuring-assignment]
   (.getChildCount ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getChildCount ^js array-destructuring-assignment source-file)))

(defn child-at
  (^js [array-destructuring-assignment index]
   (.getChildAt ^js array-destructuring-assignment index))
  (^js [array-destructuring-assignment index source-file]
   (.getChildAt ^js array-destructuring-assignment index source-file)))

(defn children
  (^js [array-destructuring-assignment]
   (.getChildren ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getChildren ^js array-destructuring-assignment source-file)))

(defn start
  (^js [array-destructuring-assignment]
   (.getStart ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getStart ^js array-destructuring-assignment source-file))
  (^js [array-destructuring-assignment source-file include-js-doc-comment?]
   (.getStart ^js array-destructuring-assignment source-file include-js-doc-comment?)))

(defn full-start
  ^js [array-destructuring-assignment]
  (.getFullStart ^js array-destructuring-assignment))

(defn get-end
  ^js [array-destructuring-assignment]
  (.getEnd ^js array-destructuring-assignment))

(defn width
  (^js [array-destructuring-assignment]
   (.getWidth ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getWidth ^js array-destructuring-assignment source-file)))

(defn full-width
  ^js [array-destructuring-assignment]
  (.getFullWidth ^js array-destructuring-assignment))

(defn leading-trivia-width
  (^js [array-destructuring-assignment]
   (.getLeadingTriviaWidth ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getLeadingTriviaWidth ^js array-destructuring-assignment source-file)))

(defn full-text
  (^js [array-destructuring-assignment]
   (.getFullText ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getFullText ^js array-destructuring-assignment source-file)))

(defn text
  (^js [array-destructuring-assignment]
   (.getText ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getText ^js array-destructuring-assignment source-file)))

(defn first-token
  (^js [array-destructuring-assignment]
   (.getFirstToken ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getFirstToken ^js array-destructuring-assignment source-file)))

(defn last-token
  (^js [array-destructuring-assignment]
   (.getLastToken ^js array-destructuring-assignment))
  (^js [array-destructuring-assignment source-file]
   (.getLastToken ^js array-destructuring-assignment source-file)))

(defn for-each-child
  (^js [array-destructuring-assignment cb-node]
   (.forEachChild ^js array-destructuring-assignment cb-node))
  (^js [array-destructuring-assignment cb-node cb-node-array]
   (.forEachChild ^js array-destructuring-assignment cb-node cb-node-array)))

(defn pos
  ^js [array-destructuring-assignment]
  (.-pos ^js array-destructuring-assignment))

(defn end
  ^js [array-destructuring-assignment]
  (.-end ^js array-destructuring-assignment))
