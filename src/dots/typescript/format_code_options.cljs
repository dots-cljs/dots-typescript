(ns dots.typescript.format-code-options)

(defn insert-space-after-comma-delimiter?
  ^js [format-code-options]
  (.-InsertSpaceAfterCommaDelimiter ^js format-code-options))

(defn set-insert-space-after-comma-delimiter!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterCommaDelimiter ^js format-code-options) value))

(defn insert-space-after-semicolon-in-for-statements?
  ^js [format-code-options]
  (.-InsertSpaceAfterSemicolonInForStatements ^js format-code-options))

(defn set-insert-space-after-semicolon-in-for-statements!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterSemicolonInForStatements ^js format-code-options) value))

(defn insert-space-before-and-after-binary-operators?
  ^js [format-code-options]
  (.-InsertSpaceBeforeAndAfterBinaryOperators ^js format-code-options))

(defn set-insert-space-before-and-after-binary-operators!
  ^js [format-code-options value]
  (set! (.-InsertSpaceBeforeAndAfterBinaryOperators ^js format-code-options) value))

(defn insert-space-after-constructor?
  ^js [format-code-options]
  (.-InsertSpaceAfterConstructor ^js format-code-options))

(defn set-insert-space-after-constructor!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterConstructor ^js format-code-options) value))

(defn insert-space-after-keywords-in-control-flow-statements?
  ^js [format-code-options]
  (.-InsertSpaceAfterKeywordsInControlFlowStatements ^js format-code-options))

(defn set-insert-space-after-keywords-in-control-flow-statements!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterKeywordsInControlFlowStatements ^js format-code-options) value))

(defn insert-space-after-function-keyword-for-anonymous-functions?
  ^js [format-code-options]
  (.-InsertSpaceAfterFunctionKeywordForAnonymousFunctions ^js format-code-options))

(defn set-insert-space-after-function-keyword-for-anonymous-functions!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterFunctionKeywordForAnonymousFunctions ^js format-code-options) value))

(defn insert-space-after-opening-and-before-closing-nonempty-parenthesis?
  ^js [format-code-options]
  (.-InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis ^js format-code-options))

(defn set-insert-space-after-opening-and-before-closing-nonempty-parenthesis!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis ^js format-code-options) value))

(defn insert-space-after-opening-and-before-closing-nonempty-brackets?
  ^js [format-code-options]
  (.-InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets ^js format-code-options))

(defn set-insert-space-after-opening-and-before-closing-nonempty-brackets!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets ^js format-code-options) value))

(defn insert-space-after-opening-and-before-closing-nonempty-braces?
  ^js [format-code-options]
  (.-InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces ^js format-code-options))

(defn set-insert-space-after-opening-and-before-closing-nonempty-braces!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterOpeningAndBeforeClosingNonemptyBraces ^js format-code-options) value))

(defn insert-space-after-opening-and-before-closing-template-string-braces?
  ^js [format-code-options]
  (.-InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces ^js format-code-options))

(defn set-insert-space-after-opening-and-before-closing-template-string-braces!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces ^js format-code-options) value))

(defn insert-space-after-opening-and-before-closing-jsx-expression-braces?
  ^js [format-code-options]
  (.-InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces ^js format-code-options))

(defn set-insert-space-after-opening-and-before-closing-jsx-expression-braces!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces ^js format-code-options) value))

(defn insert-space-after-type-assertion?
  ^js [format-code-options]
  (.-InsertSpaceAfterTypeAssertion ^js format-code-options))

(defn set-insert-space-after-type-assertion!
  ^js [format-code-options value]
  (set! (.-InsertSpaceAfterTypeAssertion ^js format-code-options) value))

(defn insert-space-before-function-parenthesis?
  ^js [format-code-options]
  (.-InsertSpaceBeforeFunctionParenthesis ^js format-code-options))

(defn set-insert-space-before-function-parenthesis!
  ^js [format-code-options value]
  (set! (.-InsertSpaceBeforeFunctionParenthesis ^js format-code-options) value))

(defn place-open-brace-on-new-line-for-functions?
  ^js [format-code-options]
  (.-PlaceOpenBraceOnNewLineForFunctions ^js format-code-options))

(defn set-place-open-brace-on-new-line-for-functions!
  ^js [format-code-options value]
  (set! (.-PlaceOpenBraceOnNewLineForFunctions ^js format-code-options) value))

(defn place-open-brace-on-new-line-for-control-blocks?
  ^js [format-code-options]
  (.-PlaceOpenBraceOnNewLineForControlBlocks ^js format-code-options))

(defn set-place-open-brace-on-new-line-for-control-blocks!
  ^js [format-code-options value]
  (set! (.-PlaceOpenBraceOnNewLineForControlBlocks ^js format-code-options) value))

(defn insert-space-before-type-annotation?
  ^js [format-code-options]
  (.-insertSpaceBeforeTypeAnnotation ^js format-code-options))

(defn set-insert-space-before-type-annotation!
  ^js [format-code-options value]
  (set! (.-insertSpaceBeforeTypeAnnotation ^js format-code-options) value))

(defn base-indent-size
  ^js [format-code-options]
  (.-BaseIndentSize ^js format-code-options))

(defn set-base-indent-size!
  ^js [format-code-options value]
  (set! (.-BaseIndentSize ^js format-code-options) value))

(defn indent-size
  ^js [format-code-options]
  (.-IndentSize ^js format-code-options))

(defn set-indent-size!
  ^js [format-code-options value]
  (set! (.-IndentSize ^js format-code-options) value))

(defn tab-size
  ^js [format-code-options]
  (.-TabSize ^js format-code-options))

(defn set-tab-size!
  ^js [format-code-options value]
  (set! (.-TabSize ^js format-code-options) value))

(defn new-line-character
  ^js [format-code-options]
  (.-NewLineCharacter ^js format-code-options))

(defn set-new-line-character!
  ^js [format-code-options value]
  (set! (.-NewLineCharacter ^js format-code-options) value))

(defn convert-tabs-to-spaces?
  ^js [format-code-options]
  (.-ConvertTabsToSpaces ^js format-code-options))

(defn set-convert-tabs-to-spaces!
  ^js [format-code-options value]
  (set! (.-ConvertTabsToSpaces ^js format-code-options) value))

(defn indent-style
  ^js [format-code-options]
  (.-IndentStyle ^js format-code-options))

(defn set-indent-style!
  ^js [format-code-options value]
  (set! (.-IndentStyle ^js format-code-options) value))
