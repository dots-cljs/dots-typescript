(ns dots.typescript.jsx-expression)

(defn kind
  ^js [jsx-expression]
  (.-kind ^js jsx-expression))

(defn parent
  ^js [jsx-expression]
  (.-parent ^js jsx-expression))

(defn dot-dot-dot-token
  ^js [jsx-expression]
  (.-dotDotDotToken ^js jsx-expression))

(defn expression
  ^js [jsx-expression]
  (.-expression ^js jsx-expression))

(defn flags
  ^js [jsx-expression]
  (.-flags ^js jsx-expression))

(defn source-file
  ^js [jsx-expression]
  (.getSourceFile ^js jsx-expression))

(defn child-count
  (^js [jsx-expression]
   (.getChildCount ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getChildCount ^js jsx-expression source-file)))

(defn child-at
  (^js [jsx-expression index]
   (.getChildAt ^js jsx-expression index))
  (^js [jsx-expression index source-file]
   (.getChildAt ^js jsx-expression index source-file)))

(defn children
  (^js [jsx-expression]
   (.getChildren ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getChildren ^js jsx-expression source-file)))

(defn start
  (^js [jsx-expression]
   (.getStart ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getStart ^js jsx-expression source-file))
  (^js [jsx-expression source-file include-js-doc-comment?]
   (.getStart ^js jsx-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-expression]
  (.getFullStart ^js jsx-expression))

(defn get-end
  ^js [jsx-expression]
  (.getEnd ^js jsx-expression))

(defn width
  (^js [jsx-expression]
   (.getWidth ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getWidth ^js jsx-expression source-file)))

(defn full-width
  ^js [jsx-expression]
  (.getFullWidth ^js jsx-expression))

(defn leading-trivia-width
  (^js [jsx-expression]
   (.getLeadingTriviaWidth ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getLeadingTriviaWidth ^js jsx-expression source-file)))

(defn full-text
  (^js [jsx-expression]
   (.getFullText ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getFullText ^js jsx-expression source-file)))

(defn text
  (^js [jsx-expression]
   (.getText ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getText ^js jsx-expression source-file)))

(defn first-token
  (^js [jsx-expression]
   (.getFirstToken ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getFirstToken ^js jsx-expression source-file)))

(defn last-token
  (^js [jsx-expression]
   (.getLastToken ^js jsx-expression))
  (^js [jsx-expression source-file]
   (.getLastToken ^js jsx-expression source-file)))

(defn for-each-child
  (^js [jsx-expression cb-node]
   (.forEachChild ^js jsx-expression cb-node))
  (^js [jsx-expression cb-node cb-node-array]
   (.forEachChild ^js jsx-expression cb-node cb-node-array)))

(defn pos
  ^js [jsx-expression]
  (.-pos ^js jsx-expression))

(defn end
  ^js [jsx-expression]
  (.-end ^js jsx-expression))
