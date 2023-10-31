(ns dots.typescript.non-null-chain)

(defn kind
  ^js [non-null-chain]
  (.-kind ^js non-null-chain))

(defn expression
  ^js [non-null-chain]
  (.-expression ^js non-null-chain))

(defn flags
  ^js [non-null-chain]
  (.-flags ^js non-null-chain))

(defn parent
  ^js [non-null-chain]
  (.-parent ^js non-null-chain))

(defn source-file
  ^js [non-null-chain]
  (.getSourceFile ^js non-null-chain))

(defn child-count
  (^js [non-null-chain]
   (.getChildCount ^js non-null-chain))
  (^js [non-null-chain source-file]
   (.getChildCount ^js non-null-chain source-file)))

(defn child-at
  (^js [non-null-chain index]
   (.getChildAt ^js non-null-chain index))
  (^js [non-null-chain index source-file]
   (.getChildAt ^js non-null-chain index source-file)))

(defn children
  (^js [non-null-chain]
   (.getChildren ^js non-null-chain))
  (^js [non-null-chain source-file]
   (.getChildren ^js non-null-chain source-file)))

(defn start
  (^js [non-null-chain]
   (.getStart ^js non-null-chain))
  (^js [non-null-chain source-file]
   (.getStart ^js non-null-chain source-file))
  (^js [non-null-chain source-file include-js-doc-comment?]
   (.getStart ^js non-null-chain source-file include-js-doc-comment?)))

(defn full-start
  ^js [non-null-chain]
  (.getFullStart ^js non-null-chain))

(defn get-end
  ^js [non-null-chain]
  (.getEnd ^js non-null-chain))

(defn width
  (^js [non-null-chain]
   (.getWidth ^js non-null-chain))
  (^js [non-null-chain source-file]
   (.getWidth ^js non-null-chain source-file)))

(defn full-width
  ^js [non-null-chain]
  (.getFullWidth ^js non-null-chain))

(defn leading-trivia-width
  (^js [non-null-chain]
   (.getLeadingTriviaWidth ^js non-null-chain))
  (^js [non-null-chain source-file]
   (.getLeadingTriviaWidth ^js non-null-chain source-file)))

(defn full-text
  (^js [non-null-chain]
   (.getFullText ^js non-null-chain))
  (^js [non-null-chain source-file]
   (.getFullText ^js non-null-chain source-file)))

(defn text
  (^js [non-null-chain]
   (.getText ^js non-null-chain))
  (^js [non-null-chain source-file]
   (.getText ^js non-null-chain source-file)))

(defn first-token
  (^js [non-null-chain]
   (.getFirstToken ^js non-null-chain))
  (^js [non-null-chain source-file]
   (.getFirstToken ^js non-null-chain source-file)))

(defn last-token
  (^js [non-null-chain]
   (.getLastToken ^js non-null-chain))
  (^js [non-null-chain source-file]
   (.getLastToken ^js non-null-chain source-file)))

(defn for-each-child
  (^js [non-null-chain cb-node]
   (.forEachChild ^js non-null-chain cb-node))
  (^js [non-null-chain cb-node cb-node-array]
   (.forEachChild ^js non-null-chain cb-node cb-node-array)))

(defn decorators
  ^js [non-null-chain]
  (.-decorators ^js non-null-chain))

(defn modifiers
  ^js [non-null-chain]
  (.-modifiers ^js non-null-chain))

(defn pos
  ^js [non-null-chain]
  (.-pos ^js non-null-chain))

(defn end
  ^js [non-null-chain]
  (.-end ^js non-null-chain))
