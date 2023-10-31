(ns dots.typescript.element-access-expression)

(defn kind
  ^js [element-access-expression]
  (.-kind ^js element-access-expression))

(defn expression
  ^js [element-access-expression]
  (.-expression ^js element-access-expression))

(defn question-dot-token
  ^js [element-access-expression]
  (.-questionDotToken ^js element-access-expression))

(defn argument-expression
  ^js [element-access-expression]
  (.-argumentExpression ^js element-access-expression))

(defn flags
  ^js [element-access-expression]
  (.-flags ^js element-access-expression))

(defn parent
  ^js [element-access-expression]
  (.-parent ^js element-access-expression))

(defn source-file
  ^js [element-access-expression]
  (.getSourceFile ^js element-access-expression))

(defn child-count
  (^js [element-access-expression]
   (.getChildCount ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getChildCount ^js element-access-expression source-file)))

(defn child-at
  (^js [element-access-expression index]
   (.getChildAt ^js element-access-expression index))
  (^js [element-access-expression index source-file]
   (.getChildAt ^js element-access-expression index source-file)))

(defn children
  (^js [element-access-expression]
   (.getChildren ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getChildren ^js element-access-expression source-file)))

(defn start
  (^js [element-access-expression]
   (.getStart ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getStart ^js element-access-expression source-file))
  (^js [element-access-expression source-file include-js-doc-comment?]
   (.getStart ^js element-access-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [element-access-expression]
  (.getFullStart ^js element-access-expression))

(defn get-end
  ^js [element-access-expression]
  (.getEnd ^js element-access-expression))

(defn width
  (^js [element-access-expression]
   (.getWidth ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getWidth ^js element-access-expression source-file)))

(defn full-width
  ^js [element-access-expression]
  (.getFullWidth ^js element-access-expression))

(defn leading-trivia-width
  (^js [element-access-expression]
   (.getLeadingTriviaWidth ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getLeadingTriviaWidth ^js element-access-expression source-file)))

(defn full-text
  (^js [element-access-expression]
   (.getFullText ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getFullText ^js element-access-expression source-file)))

(defn text
  (^js [element-access-expression]
   (.getText ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getText ^js element-access-expression source-file)))

(defn first-token
  (^js [element-access-expression]
   (.getFirstToken ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getFirstToken ^js element-access-expression source-file)))

(defn last-token
  (^js [element-access-expression]
   (.getLastToken ^js element-access-expression))
  (^js [element-access-expression source-file]
   (.getLastToken ^js element-access-expression source-file)))

(defn for-each-child
  (^js [element-access-expression cb-node]
   (.forEachChild ^js element-access-expression cb-node))
  (^js [element-access-expression cb-node cb-node-array]
   (.forEachChild ^js element-access-expression cb-node cb-node-array)))

(defn decorators
  ^js [element-access-expression]
  (.-decorators ^js element-access-expression))

(defn modifiers
  ^js [element-access-expression]
  (.-modifiers ^js element-access-expression))

(defn pos
  ^js [element-access-expression]
  (.-pos ^js element-access-expression))

(defn end
  ^js [element-access-expression]
  (.-end ^js element-access-expression))
