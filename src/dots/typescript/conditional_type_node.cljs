(ns dots.typescript.conditional-type-node)

(defn kind
  ^js [conditional-type-node]
  (.-kind ^js conditional-type-node))

(defn check-type
  ^js [conditional-type-node]
  (.-checkType ^js conditional-type-node))

(defn extends-type
  ^js [conditional-type-node]
  (.-extendsType ^js conditional-type-node))

(defn true-type
  ^js [conditional-type-node]
  (.-trueType ^js conditional-type-node))

(defn false-type
  ^js [conditional-type-node]
  (.-falseType ^js conditional-type-node))

(defn flags
  ^js [conditional-type-node]
  (.-flags ^js conditional-type-node))

(defn parent
  ^js [conditional-type-node]
  (.-parent ^js conditional-type-node))

(defn source-file
  ^js [conditional-type-node]
  (.getSourceFile ^js conditional-type-node))

(defn child-count
  (^js [conditional-type-node]
   (.getChildCount ^js conditional-type-node))
  (^js [conditional-type-node source-file]
   (.getChildCount ^js conditional-type-node source-file)))

(defn child-at
  (^js [conditional-type-node index]
   (.getChildAt ^js conditional-type-node index))
  (^js [conditional-type-node index source-file]
   (.getChildAt ^js conditional-type-node index source-file)))

(defn children
  (^js [conditional-type-node]
   (.getChildren ^js conditional-type-node))
  (^js [conditional-type-node source-file]
   (.getChildren ^js conditional-type-node source-file)))

(defn start
  (^js [conditional-type-node]
   (.getStart ^js conditional-type-node))
  (^js [conditional-type-node source-file]
   (.getStart ^js conditional-type-node source-file))
  (^js [conditional-type-node source-file include-js-doc-comment?]
   (.getStart ^js conditional-type-node source-file include-js-doc-comment?)))

(defn full-start
  ^js [conditional-type-node]
  (.getFullStart ^js conditional-type-node))

(defn get-end
  ^js [conditional-type-node]
  (.getEnd ^js conditional-type-node))

(defn width
  (^js [conditional-type-node]
   (.getWidth ^js conditional-type-node))
  (^js [conditional-type-node source-file]
   (.getWidth ^js conditional-type-node source-file)))

(defn full-width
  ^js [conditional-type-node]
  (.getFullWidth ^js conditional-type-node))

(defn leading-trivia-width
  (^js [conditional-type-node]
   (.getLeadingTriviaWidth ^js conditional-type-node))
  (^js [conditional-type-node source-file]
   (.getLeadingTriviaWidth ^js conditional-type-node source-file)))

(defn full-text
  (^js [conditional-type-node]
   (.getFullText ^js conditional-type-node))
  (^js [conditional-type-node source-file]
   (.getFullText ^js conditional-type-node source-file)))

(defn text
  (^js [conditional-type-node]
   (.getText ^js conditional-type-node))
  (^js [conditional-type-node source-file]
   (.getText ^js conditional-type-node source-file)))

(defn first-token
  (^js [conditional-type-node]
   (.getFirstToken ^js conditional-type-node))
  (^js [conditional-type-node source-file]
   (.getFirstToken ^js conditional-type-node source-file)))

(defn last-token
  (^js [conditional-type-node]
   (.getLastToken ^js conditional-type-node))
  (^js [conditional-type-node source-file]
   (.getLastToken ^js conditional-type-node source-file)))

(defn for-each-child
  (^js [conditional-type-node cb-node]
   (.forEachChild ^js conditional-type-node cb-node))
  (^js [conditional-type-node cb-node cb-node-array]
   (.forEachChild ^js conditional-type-node cb-node cb-node-array)))

(defn pos
  ^js [conditional-type-node]
  (.-pos ^js conditional-type-node))

(defn end
  ^js [conditional-type-node]
  (.-end ^js conditional-type-node))
