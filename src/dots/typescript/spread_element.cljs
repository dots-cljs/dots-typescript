(ns dots.typescript.spread-element)

(defn kind
  ^js [spread-element]
  (.-kind ^js spread-element))

(defn parent
  ^js [spread-element]
  (.-parent ^js spread-element))

(defn expression
  ^js [spread-element]
  (.-expression ^js spread-element))

(defn flags
  ^js [spread-element]
  (.-flags ^js spread-element))

(defn source-file
  ^js [spread-element]
  (.getSourceFile ^js spread-element))

(defn child-count
  (^js [spread-element]
   (.getChildCount ^js spread-element))
  (^js [spread-element source-file]
   (.getChildCount ^js spread-element source-file)))

(defn child-at
  (^js [spread-element index]
   (.getChildAt ^js spread-element index))
  (^js [spread-element index source-file]
   (.getChildAt ^js spread-element index source-file)))

(defn children
  (^js [spread-element]
   (.getChildren ^js spread-element))
  (^js [spread-element source-file]
   (.getChildren ^js spread-element source-file)))

(defn start
  (^js [spread-element]
   (.getStart ^js spread-element))
  (^js [spread-element source-file]
   (.getStart ^js spread-element source-file))
  (^js [spread-element source-file include-js-doc-comment?]
   (.getStart ^js spread-element source-file include-js-doc-comment?)))

(defn full-start
  ^js [spread-element]
  (.getFullStart ^js spread-element))

(defn get-end
  ^js [spread-element]
  (.getEnd ^js spread-element))

(defn width
  (^js [spread-element]
   (.getWidth ^js spread-element))
  (^js [spread-element source-file]
   (.getWidth ^js spread-element source-file)))

(defn full-width
  ^js [spread-element]
  (.getFullWidth ^js spread-element))

(defn leading-trivia-width
  (^js [spread-element]
   (.getLeadingTriviaWidth ^js spread-element))
  (^js [spread-element source-file]
   (.getLeadingTriviaWidth ^js spread-element source-file)))

(defn full-text
  (^js [spread-element]
   (.getFullText ^js spread-element))
  (^js [spread-element source-file]
   (.getFullText ^js spread-element source-file)))

(defn text
  (^js [spread-element]
   (.getText ^js spread-element))
  (^js [spread-element source-file]
   (.getText ^js spread-element source-file)))

(defn first-token
  (^js [spread-element]
   (.getFirstToken ^js spread-element))
  (^js [spread-element source-file]
   (.getFirstToken ^js spread-element source-file)))

(defn last-token
  (^js [spread-element]
   (.getLastToken ^js spread-element))
  (^js [spread-element source-file]
   (.getLastToken ^js spread-element source-file)))

(defn for-each-child
  (^js [spread-element cb-node]
   (.forEachChild ^js spread-element cb-node))
  (^js [spread-element cb-node cb-node-array]
   (.forEachChild ^js spread-element cb-node cb-node-array)))

(defn decorators
  ^js [spread-element]
  (.-decorators ^js spread-element))

(defn modifiers
  ^js [spread-element]
  (.-modifiers ^js spread-element))

(defn pos
  ^js [spread-element]
  (.-pos ^js spread-element))

(defn end
  ^js [spread-element]
  (.-end ^js spread-element))
