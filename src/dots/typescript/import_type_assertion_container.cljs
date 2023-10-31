(ns dots.typescript.import-type-assertion-container)

(defn kind
  ^js [import-type-assertion-container]
  (.-kind ^js import-type-assertion-container))

(defn parent
  ^js [import-type-assertion-container]
  (.-parent ^js import-type-assertion-container))

(defn assert-clause
  ^js [import-type-assertion-container]
  (.-assertClause ^js import-type-assertion-container))

(defn multi-line?
  ^js [import-type-assertion-container]
  (.-multiLine ^js import-type-assertion-container))

(defn flags
  ^js [import-type-assertion-container]
  (.-flags ^js import-type-assertion-container))

(defn source-file
  ^js [import-type-assertion-container]
  (.getSourceFile ^js import-type-assertion-container))

(defn child-count
  (^js [import-type-assertion-container]
   (.getChildCount ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getChildCount ^js import-type-assertion-container source-file)))

(defn child-at
  (^js [import-type-assertion-container index]
   (.getChildAt ^js import-type-assertion-container index))
  (^js [import-type-assertion-container index source-file]
   (.getChildAt ^js import-type-assertion-container index source-file)))

(defn children
  (^js [import-type-assertion-container]
   (.getChildren ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getChildren ^js import-type-assertion-container source-file)))

(defn start
  (^js [import-type-assertion-container]
   (.getStart ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getStart ^js import-type-assertion-container source-file))
  (^js [import-type-assertion-container source-file include-js-doc-comment?]
   (.getStart ^js import-type-assertion-container source-file include-js-doc-comment?)))

(defn full-start
  ^js [import-type-assertion-container]
  (.getFullStart ^js import-type-assertion-container))

(defn get-end
  ^js [import-type-assertion-container]
  (.getEnd ^js import-type-assertion-container))

(defn width
  (^js [import-type-assertion-container]
   (.getWidth ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getWidth ^js import-type-assertion-container source-file)))

(defn full-width
  ^js [import-type-assertion-container]
  (.getFullWidth ^js import-type-assertion-container))

(defn leading-trivia-width
  (^js [import-type-assertion-container]
   (.getLeadingTriviaWidth ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getLeadingTriviaWidth ^js import-type-assertion-container source-file)))

(defn full-text
  (^js [import-type-assertion-container]
   (.getFullText ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getFullText ^js import-type-assertion-container source-file)))

(defn text
  (^js [import-type-assertion-container]
   (.getText ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getText ^js import-type-assertion-container source-file)))

(defn first-token
  (^js [import-type-assertion-container]
   (.getFirstToken ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getFirstToken ^js import-type-assertion-container source-file)))

(defn last-token
  (^js [import-type-assertion-container]
   (.getLastToken ^js import-type-assertion-container))
  (^js [import-type-assertion-container source-file]
   (.getLastToken ^js import-type-assertion-container source-file)))

(defn for-each-child
  (^js [import-type-assertion-container cb-node]
   (.forEachChild ^js import-type-assertion-container cb-node))
  (^js [import-type-assertion-container cb-node cb-node-array]
   (.forEachChild ^js import-type-assertion-container cb-node cb-node-array)))

(defn decorators
  ^js [import-type-assertion-container]
  (.-decorators ^js import-type-assertion-container))

(defn modifiers
  ^js [import-type-assertion-container]
  (.-modifiers ^js import-type-assertion-container))

(defn pos
  ^js [import-type-assertion-container]
  (.-pos ^js import-type-assertion-container))

(defn end
  ^js [import-type-assertion-container]
  (.-end ^js import-type-assertion-container))
