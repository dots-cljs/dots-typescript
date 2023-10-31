(ns dots.typescript.satisfies-expression
  (:refer-clojure :exclude [type]))

(defn kind
  ^js [satisfies-expression]
  (.-kind ^js satisfies-expression))

(defn expression
  ^js [satisfies-expression]
  (.-expression ^js satisfies-expression))

(defn type
  ^js [satisfies-expression]
  (.-type ^js satisfies-expression))

(defn flags
  ^js [satisfies-expression]
  (.-flags ^js satisfies-expression))

(defn parent
  ^js [satisfies-expression]
  (.-parent ^js satisfies-expression))

(defn source-file
  ^js [satisfies-expression]
  (.getSourceFile ^js satisfies-expression))

(defn child-count
  (^js [satisfies-expression]
   (.getChildCount ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getChildCount ^js satisfies-expression source-file)))

(defn child-at
  (^js [satisfies-expression index]
   (.getChildAt ^js satisfies-expression index))
  (^js [satisfies-expression index source-file]
   (.getChildAt ^js satisfies-expression index source-file)))

(defn children
  (^js [satisfies-expression]
   (.getChildren ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getChildren ^js satisfies-expression source-file)))

(defn start
  (^js [satisfies-expression]
   (.getStart ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getStart ^js satisfies-expression source-file))
  (^js [satisfies-expression source-file include-js-doc-comment?]
   (.getStart ^js satisfies-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [satisfies-expression]
  (.getFullStart ^js satisfies-expression))

(defn get-end
  ^js [satisfies-expression]
  (.getEnd ^js satisfies-expression))

(defn width
  (^js [satisfies-expression]
   (.getWidth ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getWidth ^js satisfies-expression source-file)))

(defn full-width
  ^js [satisfies-expression]
  (.getFullWidth ^js satisfies-expression))

(defn leading-trivia-width
  (^js [satisfies-expression]
   (.getLeadingTriviaWidth ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getLeadingTriviaWidth ^js satisfies-expression source-file)))

(defn full-text
  (^js [satisfies-expression]
   (.getFullText ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getFullText ^js satisfies-expression source-file)))

(defn text
  (^js [satisfies-expression]
   (.getText ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getText ^js satisfies-expression source-file)))

(defn first-token
  (^js [satisfies-expression]
   (.getFirstToken ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getFirstToken ^js satisfies-expression source-file)))

(defn last-token
  (^js [satisfies-expression]
   (.getLastToken ^js satisfies-expression))
  (^js [satisfies-expression source-file]
   (.getLastToken ^js satisfies-expression source-file)))

(defn for-each-child
  (^js [satisfies-expression cb-node]
   (.forEachChild ^js satisfies-expression cb-node))
  (^js [satisfies-expression cb-node cb-node-array]
   (.forEachChild ^js satisfies-expression cb-node cb-node-array)))

(defn pos
  ^js [satisfies-expression]
  (.-pos ^js satisfies-expression))

(defn end
  ^js [satisfies-expression]
  (.-end ^js satisfies-expression))
