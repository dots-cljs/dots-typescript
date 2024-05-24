(ns dots.typescript.server.protocol.format-code-settings)

(defn insert-space-after-comma-delimiter?
  ^js [format-code-settings]
  (.-insertSpaceAfterCommaDelimiter ^js format-code-settings))

(defn set-insert-space-after-comma-delimiter!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterCommaDelimiter ^js format-code-settings) value))

(defn insert-space-after-semicolon-in-for-statements?
  ^js [format-code-settings]
  (.-insertSpaceAfterSemicolonInForStatements ^js format-code-settings))

(defn set-insert-space-after-semicolon-in-for-statements!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterSemicolonInForStatements ^js format-code-settings) value))

(defn insert-space-before-and-after-binary-operators?
  ^js [format-code-settings]
  (.-insertSpaceBeforeAndAfterBinaryOperators ^js format-code-settings))

(defn set-insert-space-before-and-after-binary-operators!
  ^js [format-code-settings value]
  (set! (.-insertSpaceBeforeAndAfterBinaryOperators ^js format-code-settings) value))

(defn insert-space-after-constructor?
  ^js [format-code-settings]
  (.-insertSpaceAfterConstructor ^js format-code-settings))

(defn set-insert-space-after-constructor!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterConstructor ^js format-code-settings) value))

(defn insert-space-after-keywords-in-control-flow-statements?
  ^js [format-code-settings]
  (.-insertSpaceAfterKeywordsInControlFlowStatements ^js format-code-settings))

(defn set-insert-space-after-keywords-in-control-flow-statements!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterKeywordsInControlFlowStatements ^js format-code-settings) value))

(defn insert-space-after-function-keyword-for-anonymous-functions?
  ^js [format-code-settings]
  (.-insertSpaceAfterFunctionKeywordForAnonymousFunctions ^js format-code-settings))

(defn set-insert-space-after-function-keyword-for-anonymous-functions!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterFunctionKeywordForAnonymousFunctions ^js format-code-settings) value))

(defn insert-space-after-opening-and-before-closing-empty-braces?
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingEmptyBraces ^js format-code-settings))

(defn set-insert-space-after-opening-and-before-closing-empty-braces!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterOpeningAndBeforeClosingEmptyBraces ^js format-code-settings) value))

(defn insert-space-after-opening-and-before-closing-nonempty-parenthesis?
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis ^js format-code-settings))

(defn set-insert-space-after-opening-and-before-closing-nonempty-parenthesis!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterOpeningAndBeforeClosingNonemptyParenthesis ^js format-code-settings) value))

(defn insert-space-after-opening-and-before-closing-nonempty-brackets?
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets ^js format-code-settings))

(defn set-insert-space-after-opening-and-before-closing-nonempty-brackets!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterOpeningAndBeforeClosingNonemptyBrackets ^js format-code-settings) value))

(defn insert-space-after-opening-and-before-closing-nonempty-braces?
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces ^js format-code-settings))

(defn set-insert-space-after-opening-and-before-closing-nonempty-braces!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterOpeningAndBeforeClosingNonemptyBraces ^js format-code-settings) value))

(defn insert-space-after-opening-and-before-closing-template-string-braces?
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces ^js format-code-settings))

(defn set-insert-space-after-opening-and-before-closing-template-string-braces!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterOpeningAndBeforeClosingTemplateStringBraces ^js format-code-settings) value))

(defn insert-space-after-opening-and-before-closing-jsx-expression-braces?
  ^js [format-code-settings]
  (.-insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces ^js format-code-settings))

(defn set-insert-space-after-opening-and-before-closing-jsx-expression-braces!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterOpeningAndBeforeClosingJsxExpressionBraces ^js format-code-settings) value))

(defn insert-space-after-type-assertion?
  ^js [format-code-settings]
  (.-insertSpaceAfterTypeAssertion ^js format-code-settings))

(defn set-insert-space-after-type-assertion!
  ^js [format-code-settings value]
  (set! (.-insertSpaceAfterTypeAssertion ^js format-code-settings) value))

(defn insert-space-before-function-parenthesis?
  ^js [format-code-settings]
  (.-insertSpaceBeforeFunctionParenthesis ^js format-code-settings))

(defn set-insert-space-before-function-parenthesis!
  ^js [format-code-settings value]
  (set! (.-insertSpaceBeforeFunctionParenthesis ^js format-code-settings) value))

(defn place-open-brace-on-new-line-for-functions?
  ^js [format-code-settings]
  (.-placeOpenBraceOnNewLineForFunctions ^js format-code-settings))

(defn set-place-open-brace-on-new-line-for-functions!
  ^js [format-code-settings value]
  (set! (.-placeOpenBraceOnNewLineForFunctions ^js format-code-settings) value))

(defn place-open-brace-on-new-line-for-control-blocks?
  ^js [format-code-settings]
  (.-placeOpenBraceOnNewLineForControlBlocks ^js format-code-settings))

(defn set-place-open-brace-on-new-line-for-control-blocks!
  ^js [format-code-settings value]
  (set! (.-placeOpenBraceOnNewLineForControlBlocks ^js format-code-settings) value))

(defn insert-space-before-type-annotation?
  ^js [format-code-settings]
  (.-insertSpaceBeforeTypeAnnotation ^js format-code-settings))

(defn set-insert-space-before-type-annotation!
  ^js [format-code-settings value]
  (set! (.-insertSpaceBeforeTypeAnnotation ^js format-code-settings) value))

(defn semicolons
  ^js [format-code-settings]
  (.-semicolons ^js format-code-settings))

(defn set-semicolons!
  ^js [format-code-settings value]
  (set! (.-semicolons ^js format-code-settings) value))

(defn indent-switch-case?
  ^js [format-code-settings]
  (.-indentSwitchCase ^js format-code-settings))

(defn set-indent-switch-case!
  ^js [format-code-settings value]
  (set! (.-indentSwitchCase ^js format-code-settings) value))

(defn base-indent-size
  ^js [format-code-settings]
  (.-baseIndentSize ^js format-code-settings))

(defn set-base-indent-size!
  ^js [format-code-settings value]
  (set! (.-baseIndentSize ^js format-code-settings) value))

(defn indent-size
  ^js [format-code-settings]
  (.-indentSize ^js format-code-settings))

(defn set-indent-size!
  ^js [format-code-settings value]
  (set! (.-indentSize ^js format-code-settings) value))

(defn tab-size
  ^js [format-code-settings]
  (.-tabSize ^js format-code-settings))

(defn set-tab-size!
  ^js [format-code-settings value]
  (set! (.-tabSize ^js format-code-settings) value))

(defn new-line-character
  ^js [format-code-settings]
  (.-newLineCharacter ^js format-code-settings))

(defn set-new-line-character!
  ^js [format-code-settings value]
  (set! (.-newLineCharacter ^js format-code-settings) value))

(defn convert-tabs-to-spaces?
  ^js [format-code-settings]
  (.-convertTabsToSpaces ^js format-code-settings))

(defn set-convert-tabs-to-spaces!
  ^js [format-code-settings value]
  (set! (.-convertTabsToSpaces ^js format-code-settings) value))

(defn indent-style
  ^js [format-code-settings]
  (.-indentStyle ^js format-code-settings))

(defn set-indent-style!
  ^js [format-code-settings value]
  (set! (.-indentStyle ^js format-code-settings) value))

(defn trim-trailing-whitespace?
  ^js [format-code-settings]
  (.-trimTrailingWhitespace ^js format-code-settings))

(defn set-trim-trailing-whitespace!
  ^js [format-code-settings value]
  (set! (.-trimTrailingWhitespace ^js format-code-settings) value))
