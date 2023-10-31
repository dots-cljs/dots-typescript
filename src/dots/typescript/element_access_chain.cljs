(ns dots.typescript.element-access-chain)

(defn kind
  ^js [element-access-chain]
  (.-kind ^js element-access-chain))

(defn expression
  ^js [element-access-chain]
  (.-expression ^js element-access-chain))

(defn question-dot-token
  ^js [element-access-chain]
  (.-questionDotToken ^js element-access-chain))

(defn argument-expression
  ^js [element-access-chain]
  (.-argumentExpression ^js element-access-chain))

(defn flags
  ^js [element-access-chain]
  (.-flags ^js element-access-chain))

(defn parent
  ^js [element-access-chain]
  (.-parent ^js element-access-chain))

(defn source-file
  ^js [element-access-chain]
  (.getSourceFile ^js element-access-chain))

(defn child-count
  (^js [element-access-chain]
   (.getChildCount ^js element-access-chain))
  (^js [element-access-chain source-file]
   (.getChildCount ^js element-access-chain source-file)))

(defn child-at
  (^js [element-access-chain index]
   (.getChildAt ^js element-access-chain index))
  (^js [element-access-chain index source-file]
   (.getChildAt ^js element-access-chain index source-file)))

(defn children
  (^js [element-access-chain]
   (.getChildren ^js element-access-chain))
  (^js [element-access-chain source-file]
   (.getChildren ^js element-access-chain source-file)))

(defn start
  (^js [element-access-chain]
   (.getStart ^js element-access-chain))
  (^js [element-access-chain source-file]
   (.getStart ^js element-access-chain source-file))
  (^js [element-access-chain source-file include-js-doc-comment?]
   (.getStart ^js element-access-chain source-file include-js-doc-comment?)))

(defn full-start
  ^js [element-access-chain]
  (.getFullStart ^js element-access-chain))

(defn get-end
  ^js [element-access-chain]
  (.getEnd ^js element-access-chain))

(defn width
  (^js [element-access-chain]
   (.getWidth ^js element-access-chain))
  (^js [element-access-chain source-file]
   (.getWidth ^js element-access-chain source-file)))

(defn full-width
  ^js [element-access-chain]
  (.getFullWidth ^js element-access-chain))

(defn leading-trivia-width
  (^js [element-access-chain]
   (.getLeadingTriviaWidth ^js element-access-chain))
  (^js [element-access-chain source-file]
   (.getLeadingTriviaWidth ^js element-access-chain source-file)))

(defn full-text
  (^js [element-access-chain]
   (.getFullText ^js element-access-chain))
  (^js [element-access-chain source-file]
   (.getFullText ^js element-access-chain source-file)))

(defn text
  (^js [element-access-chain]
   (.getText ^js element-access-chain))
  (^js [element-access-chain source-file]
   (.getText ^js element-access-chain source-file)))

(defn first-token
  (^js [element-access-chain]
   (.getFirstToken ^js element-access-chain))
  (^js [element-access-chain source-file]
   (.getFirstToken ^js element-access-chain source-file)))

(defn last-token
  (^js [element-access-chain]
   (.getLastToken ^js element-access-chain))
  (^js [element-access-chain source-file]
   (.getLastToken ^js element-access-chain source-file)))

(defn for-each-child
  (^js [element-access-chain cb-node]
   (.forEachChild ^js element-access-chain cb-node))
  (^js [element-access-chain cb-node cb-node-array]
   (.forEachChild ^js element-access-chain cb-node cb-node-array)))

(defn pos
  ^js [element-access-chain]
  (.-pos ^js element-access-chain))

(defn end
  ^js [element-access-chain]
  (.-end ^js element-access-chain))
