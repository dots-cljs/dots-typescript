(ns dots.typescript.array-literal-expression)

(defn kind
  ^js [array-literal-expression]
  (.-kind ^js array-literal-expression))

(defn elements
  ^js [array-literal-expression]
  (.-elements ^js array-literal-expression))

(defn flags
  ^js [array-literal-expression]
  (.-flags ^js array-literal-expression))

(defn parent
  ^js [array-literal-expression]
  (.-parent ^js array-literal-expression))

(defn source-file
  ^js [array-literal-expression]
  (.getSourceFile ^js array-literal-expression))

(defn child-count
  (^js [array-literal-expression]
   (.getChildCount ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getChildCount ^js array-literal-expression source-file)))

(defn child-at
  (^js [array-literal-expression index]
   (.getChildAt ^js array-literal-expression index))
  (^js [array-literal-expression index source-file]
   (.getChildAt ^js array-literal-expression index source-file)))

(defn children
  (^js [array-literal-expression]
   (.getChildren ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getChildren ^js array-literal-expression source-file)))

(defn start
  (^js [array-literal-expression]
   (.getStart ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getStart ^js array-literal-expression source-file))
  (^js [array-literal-expression source-file include-js-doc-comment?]
   (.getStart ^js array-literal-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [array-literal-expression]
  (.getFullStart ^js array-literal-expression))

(defn get-end
  ^js [array-literal-expression]
  (.getEnd ^js array-literal-expression))

(defn width
  (^js [array-literal-expression]
   (.getWidth ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getWidth ^js array-literal-expression source-file)))

(defn full-width
  ^js [array-literal-expression]
  (.getFullWidth ^js array-literal-expression))

(defn leading-trivia-width
  (^js [array-literal-expression]
   (.getLeadingTriviaWidth ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getLeadingTriviaWidth ^js array-literal-expression source-file)))

(defn full-text
  (^js [array-literal-expression]
   (.getFullText ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getFullText ^js array-literal-expression source-file)))

(defn text
  (^js [array-literal-expression]
   (.getText ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getText ^js array-literal-expression source-file)))

(defn first-token
  (^js [array-literal-expression]
   (.getFirstToken ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getFirstToken ^js array-literal-expression source-file)))

(defn last-token
  (^js [array-literal-expression]
   (.getLastToken ^js array-literal-expression))
  (^js [array-literal-expression source-file]
   (.getLastToken ^js array-literal-expression source-file)))

(defn for-each-child
  (^js [array-literal-expression cb-node]
   (.forEachChild ^js array-literal-expression cb-node))
  (^js [array-literal-expression cb-node cb-node-array]
   (.forEachChild ^js array-literal-expression cb-node cb-node-array)))

(defn decorators
  ^js [array-literal-expression]
  (.-decorators ^js array-literal-expression))

(defn modifiers
  ^js [array-literal-expression]
  (.-modifiers ^js array-literal-expression))

(defn pos
  ^js [array-literal-expression]
  (.-pos ^js array-literal-expression))

(defn end
  ^js [array-literal-expression]
  (.-end ^js array-literal-expression))
