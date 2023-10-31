(ns dots.typescript.super-element-access-expression)

(defn expression
  ^js [super-element-access-expression]
  (.-expression ^js super-element-access-expression))

(defn kind
  ^js [super-element-access-expression]
  (.-kind ^js super-element-access-expression))

(defn question-dot-token
  ^js [super-element-access-expression]
  (.-questionDotToken ^js super-element-access-expression))

(defn argument-expression
  ^js [super-element-access-expression]
  (.-argumentExpression ^js super-element-access-expression))

(defn flags
  ^js [super-element-access-expression]
  (.-flags ^js super-element-access-expression))

(defn parent
  ^js [super-element-access-expression]
  (.-parent ^js super-element-access-expression))

(defn source-file
  ^js [super-element-access-expression]
  (.getSourceFile ^js super-element-access-expression))

(defn child-count
  (^js [super-element-access-expression]
   (.getChildCount ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getChildCount ^js super-element-access-expression source-file)))

(defn child-at
  (^js [super-element-access-expression index]
   (.getChildAt ^js super-element-access-expression index))
  (^js [super-element-access-expression index source-file]
   (.getChildAt ^js super-element-access-expression index source-file)))

(defn children
  (^js [super-element-access-expression]
   (.getChildren ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getChildren ^js super-element-access-expression source-file)))

(defn start
  (^js [super-element-access-expression]
   (.getStart ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getStart ^js super-element-access-expression source-file))
  (^js [super-element-access-expression source-file include-js-doc-comment?]
   (.getStart ^js super-element-access-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [super-element-access-expression]
  (.getFullStart ^js super-element-access-expression))

(defn get-end
  ^js [super-element-access-expression]
  (.getEnd ^js super-element-access-expression))

(defn width
  (^js [super-element-access-expression]
   (.getWidth ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getWidth ^js super-element-access-expression source-file)))

(defn full-width
  ^js [super-element-access-expression]
  (.getFullWidth ^js super-element-access-expression))

(defn leading-trivia-width
  (^js [super-element-access-expression]
   (.getLeadingTriviaWidth ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getLeadingTriviaWidth ^js super-element-access-expression source-file)))

(defn full-text
  (^js [super-element-access-expression]
   (.getFullText ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getFullText ^js super-element-access-expression source-file)))

(defn text
  (^js [super-element-access-expression]
   (.getText ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getText ^js super-element-access-expression source-file)))

(defn first-token
  (^js [super-element-access-expression]
   (.getFirstToken ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getFirstToken ^js super-element-access-expression source-file)))

(defn last-token
  (^js [super-element-access-expression]
   (.getLastToken ^js super-element-access-expression))
  (^js [super-element-access-expression source-file]
   (.getLastToken ^js super-element-access-expression source-file)))

(defn for-each-child
  (^js [super-element-access-expression cb-node]
   (.forEachChild ^js super-element-access-expression cb-node))
  (^js [super-element-access-expression cb-node cb-node-array]
   (.forEachChild ^js super-element-access-expression cb-node cb-node-array)))

(defn pos
  ^js [super-element-access-expression]
  (.-pos ^js super-element-access-expression))

(defn end
  ^js [super-element-access-expression]
  (.-end ^js super-element-access-expression))
