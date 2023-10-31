(ns dots.typescript.type-node)

(defn kind
  ^js [type-node]
  (.-kind ^js type-node))

(defn flags
  ^js [type-node]
  (.-flags ^js type-node))

(defn parent
  ^js [type-node]
  (.-parent ^js type-node))

(defn source-file
  ^js [type-node]
  (.getSourceFile ^js type-node))

(defn child-count
  (^js [type-node]
   (.getChildCount ^js type-node))
  (^js [type-node source-file]
   (.getChildCount ^js type-node source-file)))

(defn child-at
  (^js [type-node index]
   (.getChildAt ^js type-node index))
  (^js [type-node index source-file]
   (.getChildAt ^js type-node index source-file)))

(defn children
  (^js [type-node]
   (.getChildren ^js type-node))
  (^js [type-node source-file]
   (.getChildren ^js type-node source-file)))

(defn start
  (^js [type-node]
   (.getStart ^js type-node))
  (^js [type-node source-file]
   (.getStart ^js type-node source-file))
  (^js [type-node source-file include-js-doc-comment?]
   (.getStart ^js type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [type-node]
  (.getFullStart ^js type-node))

(defn get-end
  ^js [type-node]
  (.getEnd ^js type-node))

(defn width
  (^js [type-node]
   (.getWidth ^js type-node))
  (^js [type-node source-file]
   (.getWidth ^js type-node source-file)))

(defn full-width
  ^js [type-node]
  (.getFullWidth ^js type-node))

(defn leading-trivia-width
  (^js [type-node]
   (.getLeadingTriviaWidth ^js type-node))
  (^js [type-node source-file]
   (.getLeadingTriviaWidth ^js type-node source-file)))

(defn full-text
  (^js [type-node]
   (.getFullText ^js type-node))
  (^js [type-node source-file]
   (.getFullText ^js type-node source-file)))

(defn text
  (^js [type-node]
   (.getText ^js type-node))
  (^js [type-node source-file]
   (.getText ^js type-node source-file)))

(defn first-token
  (^js [type-node]
   (.getFirstToken ^js type-node))
  (^js [type-node source-file]
   (.getFirstToken ^js type-node source-file)))

(defn last-token
  (^js [type-node]
   (.getLastToken ^js type-node))
  (^js [type-node source-file]
   (.getLastToken ^js type-node source-file)))

(defn for-each-child
  (^js [type-node cb-node]
   (.forEachChild ^js type-node cb-node))
  (^js [type-node cb-node cb-node-array]
   (.forEachChild ^js type-node cb-node cb-node-array)))

(defn decorators
  ^js [type-node]
  (.-decorators ^js type-node))

(defn modifiers
  ^js [type-node]
  (.-modifiers ^js type-node))

(defn pos
  ^js [type-node]
  (.-pos ^js type-node))

(defn end
  ^js [type-node]
  (.-end ^js type-node))
