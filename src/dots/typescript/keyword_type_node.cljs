(ns dots.typescript.keyword-type-node)

(defn kind
  ^js [keyword-type-node]
  (.-kind ^js keyword-type-node))

(defn flags
  ^js [keyword-type-node]
  (.-flags ^js keyword-type-node))

(defn parent
  ^js [keyword-type-node]
  (.-parent ^js keyword-type-node))

(defn source-file
  ^js [keyword-type-node]
  (.getSourceFile ^js keyword-type-node))

(defn child-count
  (^js [keyword-type-node]
   (.getChildCount ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getChildCount ^js keyword-type-node source-file)))

(defn child-at
  (^js [keyword-type-node index]
   (.getChildAt ^js keyword-type-node index))
  (^js [keyword-type-node index source-file]
   (.getChildAt ^js keyword-type-node index source-file)))

(defn children
  (^js [keyword-type-node]
   (.getChildren ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getChildren ^js keyword-type-node source-file)))

(defn start
  (^js [keyword-type-node]
   (.getStart ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getStart ^js keyword-type-node source-file))
  (^js [keyword-type-node source-file include-js-doc-comment?]
   (.getStart ^js keyword-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [keyword-type-node]
  (.getFullStart ^js keyword-type-node))

(defn get-end
  ^js [keyword-type-node]
  (.getEnd ^js keyword-type-node))

(defn width
  (^js [keyword-type-node]
   (.getWidth ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getWidth ^js keyword-type-node source-file)))

(defn full-width
  ^js [keyword-type-node]
  (.getFullWidth ^js keyword-type-node))

(defn leading-trivia-width
  (^js [keyword-type-node]
   (.getLeadingTriviaWidth ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getLeadingTriviaWidth ^js keyword-type-node source-file)))

(defn full-text
  (^js [keyword-type-node]
   (.getFullText ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getFullText ^js keyword-type-node source-file)))

(defn text
  (^js [keyword-type-node]
   (.getText ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getText ^js keyword-type-node source-file)))

(defn first-token
  (^js [keyword-type-node]
   (.getFirstToken ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getFirstToken ^js keyword-type-node source-file)))

(defn last-token
  (^js [keyword-type-node]
   (.getLastToken ^js keyword-type-node))
  (^js [keyword-type-node source-file]
   (.getLastToken ^js keyword-type-node source-file)))

(defn for-each-child
  (^js [keyword-type-node cb-node]
   (.forEachChild ^js keyword-type-node cb-node))
  (^js [keyword-type-node cb-node cb-node-array]
   (.forEachChild ^js keyword-type-node cb-node cb-node-array)))

(defn decorators
  ^js [keyword-type-node]
  (.-decorators ^js keyword-type-node))

(defn modifiers
  ^js [keyword-type-node]
  (.-modifiers ^js keyword-type-node))

(defn pos
  ^js [keyword-type-node]
  (.-pos ^js keyword-type-node))

(defn end
  ^js [keyword-type-node]
  (.-end ^js keyword-type-node))
