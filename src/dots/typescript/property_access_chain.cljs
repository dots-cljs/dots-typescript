(ns dots.typescript.property-access-chain
  (:refer-clojure :exclude [name]))

(defn name
  ^js [property-access-chain]
  (.-name ^js property-access-chain))

(defn kind
  ^js [property-access-chain]
  (.-kind ^js property-access-chain))

(defn expression
  ^js [property-access-chain]
  (.-expression ^js property-access-chain))

(defn question-dot-token
  ^js [property-access-chain]
  (.-questionDotToken ^js property-access-chain))

(defn flags
  ^js [property-access-chain]
  (.-flags ^js property-access-chain))

(defn parent
  ^js [property-access-chain]
  (.-parent ^js property-access-chain))

(defn source-file
  ^js [property-access-chain]
  (.getSourceFile ^js property-access-chain))

(defn child-count
  (^js [property-access-chain]
   (.getChildCount ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getChildCount ^js property-access-chain source-file)))

(defn child-at
  (^js [property-access-chain index]
   (.getChildAt ^js property-access-chain index))
  (^js [property-access-chain index source-file]
   (.getChildAt ^js property-access-chain index source-file)))

(defn children
  (^js [property-access-chain]
   (.getChildren ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getChildren ^js property-access-chain source-file)))

(defn start
  (^js [property-access-chain]
   (.getStart ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getStart ^js property-access-chain source-file))
  (^js [property-access-chain source-file include-js-doc-comment?]
   (.getStart ^js property-access-chain source-file include-js-doc-comment?)))

(defn full-start
  ^js [property-access-chain]
  (.getFullStart ^js property-access-chain))

(defn get-end
  ^js [property-access-chain]
  (.getEnd ^js property-access-chain))

(defn width
  (^js [property-access-chain]
   (.getWidth ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getWidth ^js property-access-chain source-file)))

(defn full-width
  ^js [property-access-chain]
  (.getFullWidth ^js property-access-chain))

(defn leading-trivia-width
  (^js [property-access-chain]
   (.getLeadingTriviaWidth ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getLeadingTriviaWidth ^js property-access-chain source-file)))

(defn full-text
  (^js [property-access-chain]
   (.getFullText ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getFullText ^js property-access-chain source-file)))

(defn text
  (^js [property-access-chain]
   (.getText ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getText ^js property-access-chain source-file)))

(defn first-token
  (^js [property-access-chain]
   (.getFirstToken ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getFirstToken ^js property-access-chain source-file)))

(defn last-token
  (^js [property-access-chain]
   (.getLastToken ^js property-access-chain))
  (^js [property-access-chain source-file]
   (.getLastToken ^js property-access-chain source-file)))

(defn for-each-child
  (^js [property-access-chain cb-node]
   (.forEachChild ^js property-access-chain cb-node))
  (^js [property-access-chain cb-node cb-node-array]
   (.forEachChild ^js property-access-chain cb-node cb-node-array)))

(defn decorators
  ^js [property-access-chain]
  (.-decorators ^js property-access-chain))

(defn modifiers
  ^js [property-access-chain]
  (.-modifiers ^js property-access-chain))

(defn pos
  ^js [property-access-chain]
  (.-pos ^js property-access-chain))

(defn end
  ^js [property-access-chain]
  (.-end ^js property-access-chain))
