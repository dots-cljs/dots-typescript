(ns dots.typescript.conditional-expression)

(defn kind
  ^js [conditional-expression]
  (.-kind ^js conditional-expression))

(defn condition
  ^js [conditional-expression]
  (.-condition ^js conditional-expression))

(defn question-token
  ^js [conditional-expression]
  (.-questionToken ^js conditional-expression))

(defn when-true
  ^js [conditional-expression]
  (.-whenTrue ^js conditional-expression))

(defn colon-token
  ^js [conditional-expression]
  (.-colonToken ^js conditional-expression))

(defn when-false
  ^js [conditional-expression]
  (.-whenFalse ^js conditional-expression))

(defn flags
  ^js [conditional-expression]
  (.-flags ^js conditional-expression))

(defn parent
  ^js [conditional-expression]
  (.-parent ^js conditional-expression))

(defn source-file
  ^js [conditional-expression]
  (.getSourceFile ^js conditional-expression))

(defn child-count
  (^js [conditional-expression]
   (.getChildCount ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getChildCount ^js conditional-expression source-file)))

(defn child-at
  (^js [conditional-expression index]
   (.getChildAt ^js conditional-expression index))
  (^js [conditional-expression index source-file]
   (.getChildAt ^js conditional-expression index source-file)))

(defn children
  (^js [conditional-expression]
   (.getChildren ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getChildren ^js conditional-expression source-file)))

(defn start
  (^js [conditional-expression]
   (.getStart ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getStart ^js conditional-expression source-file))
  (^js [conditional-expression source-file include-js-doc-comment?]
   (.getStart ^js conditional-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [conditional-expression]
  (.getFullStart ^js conditional-expression))

(defn get-end
  ^js [conditional-expression]
  (.getEnd ^js conditional-expression))

(defn width
  (^js [conditional-expression]
   (.getWidth ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getWidth ^js conditional-expression source-file)))

(defn full-width
  ^js [conditional-expression]
  (.getFullWidth ^js conditional-expression))

(defn leading-trivia-width
  (^js [conditional-expression]
   (.getLeadingTriviaWidth ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getLeadingTriviaWidth ^js conditional-expression source-file)))

(defn full-text
  (^js [conditional-expression]
   (.getFullText ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getFullText ^js conditional-expression source-file)))

(defn text
  (^js [conditional-expression]
   (.getText ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getText ^js conditional-expression source-file)))

(defn first-token
  (^js [conditional-expression]
   (.getFirstToken ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getFirstToken ^js conditional-expression source-file)))

(defn last-token
  (^js [conditional-expression]
   (.getLastToken ^js conditional-expression))
  (^js [conditional-expression source-file]
   (.getLastToken ^js conditional-expression source-file)))

(defn for-each-child
  (^js [conditional-expression cb-node]
   (.forEachChild ^js conditional-expression cb-node))
  (^js [conditional-expression cb-node cb-node-array]
   (.forEachChild ^js conditional-expression cb-node cb-node-array)))

(defn decorators
  ^js [conditional-expression]
  (.-decorators ^js conditional-expression))

(defn modifiers
  ^js [conditional-expression]
  (.-modifiers ^js conditional-expression))

(defn pos
  ^js [conditional-expression]
  (.-pos ^js conditional-expression))

(defn end
  ^js [conditional-expression]
  (.-end ^js conditional-expression))
