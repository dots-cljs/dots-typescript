(ns dots.typescript.call-chain)

(defn kind
  ^js [call-chain]
  (.-kind ^js call-chain))

(defn expression
  ^js [call-chain]
  (.-expression ^js call-chain))

(defn question-dot-token
  ^js [call-chain]
  (.-questionDotToken ^js call-chain))

(defn type-arguments
  ^js [call-chain]
  (.-typeArguments ^js call-chain))

(defn arguments
  ^js [call-chain]
  (.-arguments ^js call-chain))

(defn flags
  ^js [call-chain]
  (.-flags ^js call-chain))

(defn parent
  ^js [call-chain]
  (.-parent ^js call-chain))

(defn source-file
  ^js [call-chain]
  (.getSourceFile ^js call-chain))

(defn child-count
  (^js [call-chain]
   (.getChildCount ^js call-chain))
  (^js [call-chain source-file]
   (.getChildCount ^js call-chain source-file)))

(defn child-at
  (^js [call-chain index]
   (.getChildAt ^js call-chain index))
  (^js [call-chain index source-file]
   (.getChildAt ^js call-chain index source-file)))

(defn children
  (^js [call-chain]
   (.getChildren ^js call-chain))
  (^js [call-chain source-file]
   (.getChildren ^js call-chain source-file)))

(defn start
  (^js [call-chain]
   (.getStart ^js call-chain))
  (^js [call-chain source-file]
   (.getStart ^js call-chain source-file))
  (^js [call-chain source-file include-js-doc-comment?]
   (.getStart ^js call-chain source-file include-js-doc-comment?)))

(defn full-start
  ^js [call-chain]
  (.getFullStart ^js call-chain))

(defn get-end
  ^js [call-chain]
  (.getEnd ^js call-chain))

(defn width
  (^js [call-chain]
   (.getWidth ^js call-chain))
  (^js [call-chain source-file]
   (.getWidth ^js call-chain source-file)))

(defn full-width
  ^js [call-chain]
  (.getFullWidth ^js call-chain))

(defn leading-trivia-width
  (^js [call-chain]
   (.getLeadingTriviaWidth ^js call-chain))
  (^js [call-chain source-file]
   (.getLeadingTriviaWidth ^js call-chain source-file)))

(defn full-text
  (^js [call-chain]
   (.getFullText ^js call-chain))
  (^js [call-chain source-file]
   (.getFullText ^js call-chain source-file)))

(defn text
  (^js [call-chain]
   (.getText ^js call-chain))
  (^js [call-chain source-file]
   (.getText ^js call-chain source-file)))

(defn first-token
  (^js [call-chain]
   (.getFirstToken ^js call-chain))
  (^js [call-chain source-file]
   (.getFirstToken ^js call-chain source-file)))

(defn last-token
  (^js [call-chain]
   (.getLastToken ^js call-chain))
  (^js [call-chain source-file]
   (.getLastToken ^js call-chain source-file)))

(defn for-each-child
  (^js [call-chain cb-node]
   (.forEachChild ^js call-chain cb-node))
  (^js [call-chain cb-node cb-node-array]
   (.forEachChild ^js call-chain cb-node cb-node-array)))

(defn pos
  ^js [call-chain]
  (.-pos ^js call-chain))

(defn end
  ^js [call-chain]
  (.-end ^js call-chain))
