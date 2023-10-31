(ns dots.typescript.array-binding-pattern)

(defn kind
  ^js [array-binding-pattern]
  (.-kind ^js array-binding-pattern))

(defn parent
  ^js [array-binding-pattern]
  (.-parent ^js array-binding-pattern))

(defn elements
  ^js [array-binding-pattern]
  (.-elements ^js array-binding-pattern))

(defn flags
  ^js [array-binding-pattern]
  (.-flags ^js array-binding-pattern))

(defn source-file
  ^js [array-binding-pattern]
  (.getSourceFile ^js array-binding-pattern))

(defn child-count
  (^js [array-binding-pattern]
   (.getChildCount ^js array-binding-pattern))
  (^js [array-binding-pattern source-file]
   (.getChildCount ^js array-binding-pattern source-file)))

(defn child-at
  (^js [array-binding-pattern index]
   (.getChildAt ^js array-binding-pattern index))
  (^js [array-binding-pattern index source-file]
   (.getChildAt ^js array-binding-pattern index source-file)))

(defn children
  (^js [array-binding-pattern]
   (.getChildren ^js array-binding-pattern))
  (^js [array-binding-pattern source-file]
   (.getChildren ^js array-binding-pattern source-file)))

(defn start
  (^js [array-binding-pattern]
   (.getStart ^js array-binding-pattern))
  (^js [array-binding-pattern source-file]
   (.getStart ^js array-binding-pattern source-file))
  (^js [array-binding-pattern source-file include-js-doc-comment?]
   (.getStart ^js array-binding-pattern source-file include-js-doc-comment?)))

(defn full-start
  ^js [array-binding-pattern]
  (.getFullStart ^js array-binding-pattern))

(defn get-end
  ^js [array-binding-pattern]
  (.getEnd ^js array-binding-pattern))

(defn width
  (^js [array-binding-pattern]
   (.getWidth ^js array-binding-pattern))
  (^js [array-binding-pattern source-file]
   (.getWidth ^js array-binding-pattern source-file)))

(defn full-width
  ^js [array-binding-pattern]
  (.getFullWidth ^js array-binding-pattern))

(defn leading-trivia-width
  (^js [array-binding-pattern]
   (.getLeadingTriviaWidth ^js array-binding-pattern))
  (^js [array-binding-pattern source-file]
   (.getLeadingTriviaWidth ^js array-binding-pattern source-file)))

(defn full-text
  (^js [array-binding-pattern]
   (.getFullText ^js array-binding-pattern))
  (^js [array-binding-pattern source-file]
   (.getFullText ^js array-binding-pattern source-file)))

(defn text
  (^js [array-binding-pattern]
   (.getText ^js array-binding-pattern))
  (^js [array-binding-pattern source-file]
   (.getText ^js array-binding-pattern source-file)))

(defn first-token
  (^js [array-binding-pattern]
   (.getFirstToken ^js array-binding-pattern))
  (^js [array-binding-pattern source-file]
   (.getFirstToken ^js array-binding-pattern source-file)))

(defn last-token
  (^js [array-binding-pattern]
   (.getLastToken ^js array-binding-pattern))
  (^js [array-binding-pattern source-file]
   (.getLastToken ^js array-binding-pattern source-file)))

(defn for-each-child
  (^js [array-binding-pattern cb-node]
   (.forEachChild ^js array-binding-pattern cb-node))
  (^js [array-binding-pattern cb-node cb-node-array]
   (.forEachChild ^js array-binding-pattern cb-node cb-node-array)))

(defn decorators
  ^js [array-binding-pattern]
  (.-decorators ^js array-binding-pattern))

(defn modifiers
  ^js [array-binding-pattern]
  (.-modifiers ^js array-binding-pattern))

(defn pos
  ^js [array-binding-pattern]
  (.-pos ^js array-binding-pattern))

(defn end
  ^js [array-binding-pattern]
  (.-end ^js array-binding-pattern))
