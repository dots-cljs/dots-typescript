(ns dots.typescript.array-type-node)

(defn kind
  ^js [array-type-node]
  (.-kind ^js array-type-node))

(defn element-type
  ^js [array-type-node]
  (.-elementType ^js array-type-node))

(defn flags
  ^js [array-type-node]
  (.-flags ^js array-type-node))

(defn parent
  ^js [array-type-node]
  (.-parent ^js array-type-node))

(defn source-file
  ^js [array-type-node]
  (.getSourceFile ^js array-type-node))

(defn child-count
  (^js [array-type-node]
   (.getChildCount ^js array-type-node))
  (^js [array-type-node source-file]
   (.getChildCount ^js array-type-node source-file)))

(defn child-at
  (^js [array-type-node index]
   (.getChildAt ^js array-type-node index))
  (^js [array-type-node index source-file]
   (.getChildAt ^js array-type-node index source-file)))

(defn children
  (^js [array-type-node]
   (.getChildren ^js array-type-node))
  (^js [array-type-node source-file]
   (.getChildren ^js array-type-node source-file)))

(defn start
  (^js [array-type-node]
   (.getStart ^js array-type-node))
  (^js [array-type-node source-file]
   (.getStart ^js array-type-node source-file))
  (^js [array-type-node source-file include-js-doc-comment?]
   (.getStart ^js array-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [array-type-node]
  (.getFullStart ^js array-type-node))

(defn get-end
  ^js [array-type-node]
  (.getEnd ^js array-type-node))

(defn width
  (^js [array-type-node]
   (.getWidth ^js array-type-node))
  (^js [array-type-node source-file]
   (.getWidth ^js array-type-node source-file)))

(defn full-width
  ^js [array-type-node]
  (.getFullWidth ^js array-type-node))

(defn leading-trivia-width
  (^js [array-type-node]
   (.getLeadingTriviaWidth ^js array-type-node))
  (^js [array-type-node source-file]
   (.getLeadingTriviaWidth ^js array-type-node source-file)))

(defn full-text
  (^js [array-type-node]
   (.getFullText ^js array-type-node))
  (^js [array-type-node source-file]
   (.getFullText ^js array-type-node source-file)))

(defn text
  (^js [array-type-node]
   (.getText ^js array-type-node))
  (^js [array-type-node source-file]
   (.getText ^js array-type-node source-file)))

(defn first-token
  (^js [array-type-node]
   (.getFirstToken ^js array-type-node))
  (^js [array-type-node source-file]
   (.getFirstToken ^js array-type-node source-file)))

(defn last-token
  (^js [array-type-node]
   (.getLastToken ^js array-type-node))
  (^js [array-type-node source-file]
   (.getLastToken ^js array-type-node source-file)))

(defn for-each-child
  (^js [array-type-node cb-node]
   (.forEachChild ^js array-type-node cb-node))
  (^js [array-type-node cb-node cb-node-array]
   (.forEachChild ^js array-type-node cb-node cb-node-array)))

(defn decorators
  ^js [array-type-node]
  (.-decorators ^js array-type-node))

(defn modifiers
  ^js [array-type-node]
  (.-modifiers ^js array-type-node))

(defn pos
  ^js [array-type-node]
  (.-pos ^js array-type-node))

(defn end
  ^js [array-type-node]
  (.-end ^js array-type-node))
