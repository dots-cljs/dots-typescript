(ns dots.typescript.named-tuple-member
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [named-tuple-member]
  (.-kind ^js named-tuple-member))

(defn dot-dot-dot-token
  ^js [named-tuple-member]
  (.-dotDotDotToken ^js named-tuple-member))

(defn name
  ^js [named-tuple-member]
  (.-name ^js named-tuple-member))

(defn question-token
  ^js [named-tuple-member]
  (.-questionToken ^js named-tuple-member))

(defn type
  ^js [named-tuple-member]
  (.-type ^js named-tuple-member))

(defn flags
  ^js [named-tuple-member]
  (.-flags ^js named-tuple-member))

(defn parent
  ^js [named-tuple-member]
  (.-parent ^js named-tuple-member))

(defn source-file
  ^js [named-tuple-member]
  (.getSourceFile ^js named-tuple-member))

(defn child-count
  (^js [named-tuple-member]
   (.getChildCount ^js named-tuple-member))
  (^js [named-tuple-member source-file]
   (.getChildCount ^js named-tuple-member source-file)))

(defn child-at
  (^js [named-tuple-member index]
   (.getChildAt ^js named-tuple-member index))
  (^js [named-tuple-member index source-file]
   (.getChildAt ^js named-tuple-member index source-file)))

(defn children
  (^js [named-tuple-member]
   (.getChildren ^js named-tuple-member))
  (^js [named-tuple-member source-file]
   (.getChildren ^js named-tuple-member source-file)))

(defn start
  (^js [named-tuple-member]
   (.getStart ^js named-tuple-member))
  (^js [named-tuple-member source-file]
   (.getStart ^js named-tuple-member source-file))
  (^js [named-tuple-member source-file include-js-doc-comment?]
   (.getStart ^js named-tuple-member source-file include-js-doc-comment?)))

(defn full-start
  ^js [named-tuple-member]
  (.getFullStart ^js named-tuple-member))

(defn get-end
  ^js [named-tuple-member]
  (.getEnd ^js named-tuple-member))

(defn width
  (^js [named-tuple-member]
   (.getWidth ^js named-tuple-member))
  (^js [named-tuple-member source-file]
   (.getWidth ^js named-tuple-member source-file)))

(defn full-width
  ^js [named-tuple-member]
  (.getFullWidth ^js named-tuple-member))

(defn leading-trivia-width
  (^js [named-tuple-member]
   (.getLeadingTriviaWidth ^js named-tuple-member))
  (^js [named-tuple-member source-file]
   (.getLeadingTriviaWidth ^js named-tuple-member source-file)))

(defn full-text
  (^js [named-tuple-member]
   (.getFullText ^js named-tuple-member))
  (^js [named-tuple-member source-file]
   (.getFullText ^js named-tuple-member source-file)))

(defn text
  (^js [named-tuple-member]
   (.getText ^js named-tuple-member))
  (^js [named-tuple-member source-file]
   (.getText ^js named-tuple-member source-file)))

(defn first-token
  (^js [named-tuple-member]
   (.getFirstToken ^js named-tuple-member))
  (^js [named-tuple-member source-file]
   (.getFirstToken ^js named-tuple-member source-file)))

(defn last-token
  (^js [named-tuple-member]
   (.getLastToken ^js named-tuple-member))
  (^js [named-tuple-member source-file]
   (.getLastToken ^js named-tuple-member source-file)))

(defn for-each-child
  (^js [named-tuple-member cb-node]
   (.forEachChild ^js named-tuple-member cb-node))
  (^js [named-tuple-member cb-node cb-node-array]
   (.forEachChild ^js named-tuple-member cb-node cb-node-array)))

(defn pos
  ^js [named-tuple-member]
  (.-pos ^js named-tuple-member))

(defn end
  ^js [named-tuple-member]
  (.-end ^js named-tuple-member))
